package adivinha.modelo;

public class Partida {

    private String nome;
    private int tentativas;
    private long tempoMs;
    private String autor;

    public Partida(String nome, int tentativas, long tempoMs, String autor) {
        this.nome = nome;
        this.tentativas = tentativas;
        this.tempoMs = tempoMs;
        this.autor = autor;

    }

    public String getNome() {
        return nome;
    }

    public int getTentativas() {
        return tentativas;
    }

    public long getTempoMs() {
        return tempoMs;
    }

    public String getAutor() {
        return autor;
    }
}
