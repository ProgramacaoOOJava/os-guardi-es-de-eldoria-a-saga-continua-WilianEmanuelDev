import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Lista polimórfica — aceita qualquer subtipo de Personagem
        ArrayList<Personagem> personagens = new ArrayList<>();

        personagens.add(new Mago("Eldoran",   7, 60, 18.0));
        personagens.add(new Mago("Sylvara",   9, 55, 22.0));
        personagens.add(new Guerreiro("Arthemis", 5, 80, 12.5));
        personagens.add(new Guerreiro("Drakthar", 6, 90, 15.0));

        for (Personagem p : personagens) {

            // 1. Status inicial
            p.exibirStatus();

            // 2. Polimorfismo dinâmico — Java chama a versão correta de usarHabilidade()
            p.usarHabilidade();

            // 3. Apenas Magos são auditáveis — casting explícito para Auditavel
            if (p instanceof Mago) {
                Auditavel auditavel = (Auditavel) p;
                auditavel.registrarAcao("Conjurou bola de fogo");
                auditavel.auditarAcoes();
            }

            // 4. Bênção via casting explícito para Personagem
            Personagem personagem = (Personagem) p;
            personagem.atribuirBencao(2.0);

            // 5. Status atualizado após bênção
            p.exibirStatus();

            System.out.println();
        }
    }
}
