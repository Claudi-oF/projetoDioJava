package estudosPooJava.edu.claudio.terceirasemana.Abstracao;

import estudosPooJava.edu.claudio.terceirasemana.Encapsulamento.MSNMessenger;

public class ComputadorPedrinhoAbstracao {
    public static void main(String[] args) {
        //abring msn messenger
        MSNMessenger msg = new MSNMessenger();

        msg.enviarMensagem();
        msg.receberMensagem();

        //abring facebook messenger
        FacebookMessengerAbstracao fcb = new FacebookMessengerAbstracao();

        fcb.enviarMensagem();
        fcb.receberMensagem();

        //abring msn messenger
        TelegramAbstracao telegram = new TelegramAbstracao();

        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
