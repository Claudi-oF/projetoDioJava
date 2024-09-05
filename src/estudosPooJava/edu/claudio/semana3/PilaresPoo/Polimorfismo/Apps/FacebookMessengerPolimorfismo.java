package estudosPooJava.edu.claudio.semana3.PilaresPoo.Polimorfismo.Apps;

import estudosPooJava.edu.claudio.semana3.PilaresPoo.Abstracao.MSNMessengerAbstracao;

public class FacebookMessengerPolimorfismo extends ServicoMensagemInstantaneaPolimorfismo {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo facebook");
    }
    
}
