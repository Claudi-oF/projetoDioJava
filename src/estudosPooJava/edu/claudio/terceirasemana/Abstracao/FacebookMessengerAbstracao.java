package estudosPooJava.edu.claudio.terceirasemana.Abstracao;

import estudosPooJava.edu.claudio.terceirasemana.Abstracao.MSNMessengerAbstracao;

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
