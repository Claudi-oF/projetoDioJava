package estudosPooJava.edu.claudio.semana3.PilaresPoo.Abstracao;

import estudosPooJava.edu.claudio.semana3.PilaresPoo.Abstracao.MSNMessengerAbstracao;

public class MSNMessengerAbstracao extends ServicoMensagemInstantaneaAbstracao{

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo msn");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo msn");
    }
    
}
