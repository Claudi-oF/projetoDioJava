package estudosPooJava.edu.claudio.semana3.PilaresPoo.Abstracao;

import estudosPooJava.edu.claudio.semana3.PilaresPoo.Encapsulamento.MSNMessenger;

public class ComputadorPedrinhoAbstracao {
    public static void main(String[] args) {
        ServicoMensagemInstantaneaAbstracao smi = null;

        String appEscolhido = "fcb";

        if (appEscolhido.equals("msn")) {
            smi = new MSNMessengerAbstracao();
        } else if (appEscolhido.equals("fcb")) {
            smi = new FacebookMessengerAbstracao();
        } else if (appEscolhido.equals("telegram")) {
            smi = new TelegramAbstracao();
        } 

        smi.enviarMensagem();
        smi.receberMensagem();
        
    }
}
