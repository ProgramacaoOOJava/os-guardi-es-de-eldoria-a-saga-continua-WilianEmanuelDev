// Classe base para todos os personagens do reino de Eldoria
public abstract class Personagem {

    private String nome;
    private String classe;
    private int    nivel;
    private int    pontosDeVida;
    private double poderBase;

    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome         = nome;
        this.classe       = classe;
        this.nivel        = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase    = poderBase;
    }

    // Cada subclasse define sua própria habilidade
    public abstract void usarHabilidade();

    // Exibe os dados formatados do personagem
    public void exibirStatus() {
        System.out.println("------------------------------");
        System.out.println("Nome          : " + nome);
        System.out.println("Classe        : " + classe);
        System.out.println("Nível         : " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base    : " + poderBase);
        System.out.println("------------------------------");
    }

    // Visível apenas para subclasses — concede bônus ao poder base
    protected void atribuirBencao(double valor) {
        poderBase += valor;
        System.out.println("Bênção concedida! Novo poder base: " + poderBase);
    }

    // Getters
    public String getNome()      { return nome; }
    public double getPoderBase() { return poderBase; }
}
