// Guerreiro herda Personagem — não implementa Auditavel
public class Guerreiro extends Personagem {

    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
    }

    @Override
    public void usarHabilidade() {
        System.out.println("Habilidade: " + getNome() + " executa um golpe devastador!");
    }
}
