package estudosPooJava.lanchonete;
import estudosPooJava.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro1 = new Cozinheiro();

        cozinheiro1.adicionarComboNoBalcao();
        cozinheiro1.adicionarLancheNoBalcao();
        cozinheiro1.adicionarSucoNoBalcao();

    }
}
