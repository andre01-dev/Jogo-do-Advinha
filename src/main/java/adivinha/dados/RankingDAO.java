package adivinha.dados;

import adivinha.modelo.Partida;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class RankingDAO {

    private static final String URL_BASE = "https://yntxukezqfwttlzgdord.supabase.co/rest/v1";
    private static final String CHAVE = "sb_publishable_2catehp_ec-RgeUcP4uHiw_xGXsXm6s";

    public void gravar(Partida p) {
        String json = String.format(
                "{\"nome\": \"%s\", \"tentativas\": %d, \"tempo_ms\": %d, \"autor\": \"%s\"}",
                p.getNome(), p.getTentativas(), p.getTempoMs(), p.getAutor());

        HttpRequest req = HttpRequest.newBuilder()
                .uri(URI.create(URL_BASE + "/ranking_adivinha"))
                .header("apikey", CHAVE)
                .header("Content-Type", "application/json")
                .header("Prefer", "return=minimal")
                .POST(HttpRequest.BodyPublishers.ofString(json, StandardCharsets.UTF_8))
                .build();

        HttpResponse<String> resp = enviar(req);
        if (resp.statusCode() != 201) {
            String corpo = resp.body();
            int i = corpo.indexOf("\"message\":\"");
            String msg = i >= 0 ? corpo.substring(i + 11, corpo.indexOf("\"", i + 11)) : corpo;
            throw new RuntimeException(msg);
        }
    }

    public List<Partida> top10() {
        HttpRequest req = HttpRequest.newBuilder()
                .uri(URI.create(URL_BASE + "/ranking_top10?select=nome,tentativas,tempo_ms,autor"))
                .header("apikey", CHAVE)
                .GET()
                .build();

        HttpResponse<String> resp = enviar(req);
        if (resp.statusCode() != 200) {
            throw new RuntimeException("Erro ao ler o ranking (código " + resp.statusCode() + ")");
        }

        List<Partida> lista = new ArrayList<>();
        String corpo = resp.body().trim();
        corpo = corpo.substring(1, corpo.length() - 1);
        if (corpo.isBlank()) {
            return lista;
        }
        for (String obj : corpo.split("\\}\\s*,\\s*\\{")) {
            lista.add(new Partida(valor(obj, "nome"),
                    Integer.parseInt(valor(obj, "tentativas")),
                    Long.parseLong(valor(obj, "tempo_ms")),
                    valor(obj, "autor")));
        }
        return lista;
    }

    private HttpResponse<String> enviar(HttpRequest req) {
        try {
            return HttpClient.newHttpClient()
                    .send(req, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        } catch (Exception e) {
            throw new RuntimeException("Sem conexão com o servidor", e);
        }
    }

    private String valor(String objeto, String campo) {
        int ini = objeto.indexOf("\"" + campo + "\":") + campo.length() + 3;
        int fim = objeto.indexOf(",", ini);
        if (fim < 0) {
            fim = objeto.length();
        }
        return objeto.substring(ini, fim).replace("\"", "").replace("}", "").trim();
    }
}