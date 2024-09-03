package estudosPooJava.edu.claudio.terceirasemana.Abstracao;

import estudosPooJava.edu.claudio.terceirasemana.Abstracao.MSNMessengerAbstracao;

public class TelegramAbstracao extends ServicoMensagemInstantaneaAbstracao{

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo telegram");
    }
    
}
