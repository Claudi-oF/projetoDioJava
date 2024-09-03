package estudosPooJava.edu.claudio.terceirasemana.Polimorfismo;

import estudosPooJava.edu.claudio.terceirasemana.Abstracao.MSNMessengerAbstracao;

public class FacebookMessengerPolimorfismo extends ServicoMensagemInstantaneaPolimorfismo {

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo facebook");
    }
    
}
