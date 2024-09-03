package estudosPooJava.lanchonete.atendimento.cozinha;

public class Cozinheiro {
    
    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionar lanche natural hamburger no balcao");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando suco no balcao");
    }

    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
}
