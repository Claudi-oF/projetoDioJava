package estudosPooJava.edu.claudio.semana3.PilaresPoo.Polimorfismo.Apps;

import estudosPooJava.edu.claudio.semana3.PilaresPoo.Abstracao.MSNMessengerAbstracao;

public class TelegramPolimorfismo extends ServicoMensagemInstantaneaPolimorfismo{

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo telegram");
    }
    
}
