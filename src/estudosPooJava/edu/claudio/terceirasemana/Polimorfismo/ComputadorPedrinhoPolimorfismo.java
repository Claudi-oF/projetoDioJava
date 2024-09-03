package estudosPooJava.edu.claudio.terceirasemana.Polimorfismo;
import estudosPooJava.edu.claudio.terceirasemana.Polimorfismo.Apps.MSNMessengerPolimorfismo;
import estudosPooJava.edu.claudio.terceirasemana.Polimorfismo.Apps.FacebookMessengerPolimorfismo;
import estudosPooJava.edu.claudio.terceirasemana.Polimorfismo.Apps.TelegramPolimorfismo;

public class ComputadorPedrinhoPolimorfismo {
    public static void main(String[] args) {
        //abring msn messenger
        MSNMessengerPolimorfismo msg = new MSNMessengerPolimorfismo();

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
