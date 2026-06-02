import java.util.ArrayList;

// Mago herda Personagem e implementa Auditavel para registrar suas ações
public class Mago extends Personagem implements Auditavel {
    private ArrayList<String> acoes;

    public Mago(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.acoes = new ArrayList<>();
    }

// Lista privada de ações realizadas pelo mago
        @Override
    public void usarHabilidade() {
        System.out.println("Habilidade: " + getNome() + " conjura uma bola de fogo!");
    }

    @Override
    public void registrarAcao(String acao) {
        acoes.add(acao);
    }

    @Override
    public void auditarAcoes() {
        System.out.println("Ações auditadas de " + getNome() + ":");
        for (String acao : acoes) {
            System.out.println("  - " + acao);
        }
    }
}
