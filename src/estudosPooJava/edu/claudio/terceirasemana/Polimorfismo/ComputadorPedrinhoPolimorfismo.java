package estudosPooJava.edu.claudio.terceirasemana.Polimorfismo;

import estudosPooJava.edu.claudio.terceirasemana.Encapsulamento.MSNMessenger;

public class ComputadorPedrinhoPolimorfismo {
    public static void main(String[] args) {
        //abring msn messenger
        MSNMessenger msg = new MSNMessenger();

        msg.enviarMensagem();
        msg.receberMensagem();

        //abring facebook messenger
        FacebookMessengerPolimorfismo fcb = new FacebookMessengerPolimorfismo();

        fcb.enviarMensagem();
        fcb.receberMensagem();

        //abring msn messenger
        TelegramPolimorfismo telegram = new TelegramPolimorfismo();

        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
