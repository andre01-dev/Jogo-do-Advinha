package adivinha.modelo;

import java.util.Random;

public class Jogo {

    private int numeroSecreto;
    private int tentativas;
    private long inicioMs;
    private long fimMs;
    private boolean terminado;
    private Random random = new Random();

    public Jogo() {
        novoJogo();
    }

    public Jogo(int numeroSecreto) {
        this.numeroSecreto = numeroSecreto;
        this.tentativas = 0;
        this.inicioMs = 0;
        this.fimMs = 0;
        this.terminado = false;
    }

    public void novoJogo() {
        numeroSecreto = random.nextInt(1000) + 1;
        tentativas = 0;
        inicioMs = 0;
        fimMs = 0;
        terminado = false;
    }

    public Resultado avaliar(int palpite) {
        if (palpite < 1 || palpite > 1000) {
            throw new IllegalArgumentException("Palpite inválido! O palpite deve estar entre 1 e 1000.");
        }
        if (terminado) {
            throw new IllegalStateException("Partida finalizada!");
        }

        tentativas++;

        if (tentativas == 1) {
            inicioMs = System.currentTimeMillis();
        }
        if (palpite == numeroSecreto) {
            fimMs = System.currentTimeMillis();
            terminado = true;
            return Resultado.ACERTOU;
        }
        if (numeroSecreto > palpite) {
            return Resultado.MAIOR;
        }
        return Resultado.MENOR;
    }

    public int getTentativas() {
        return tentativas;
    }

    public long getTempoMs() {
        if (tentativas == 0) {
            return 0;
        }
        if (terminado) {
            return fimMs - inicioMs;
        }
        return System.currentTimeMillis() - inicioMs;
    }

    public boolean isTerminado() {
        return terminado;
    }
}