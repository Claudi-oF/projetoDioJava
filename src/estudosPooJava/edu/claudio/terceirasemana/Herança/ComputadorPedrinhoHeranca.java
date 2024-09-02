package estudosPooJava.edu.claudio.terceirasemana.Herança;

import estudosPooJava.edu.claudio.terceirasemana.Encapsulamento.MSNMessenger;

public class ComputadorPedrinhoHeranca {
    public static void main(String[] args) {
        //abring msn messenger
        MSNMessenger msg = new MSNMessenger();

        msg.enviarMensagem();
        msg.receberMensagem();

        //abring facebook messenger
        FacebookMessenger fcb = new FacebookMessenger();

        fcb.enviarMensagem();
        fcb.receberMensagem();

        //abring msn messenger
        Telegram telegram = new Telegram();

        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
