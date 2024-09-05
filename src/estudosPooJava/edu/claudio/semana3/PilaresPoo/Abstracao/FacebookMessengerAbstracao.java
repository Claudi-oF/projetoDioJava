package estudosPooJava.edu.claudio.semana3.PilaresPoo.Abstracao;

import estudosPooJava.edu.claudio.semana3.PilaresPoo.Abstracao.MSNMessengerAbstracao;

public class FacebookMessengerAbstracao extends ServicoMensagemInstantaneaAbstracao {

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo facebook");
    }
    
}
