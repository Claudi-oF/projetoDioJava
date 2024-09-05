package estudosPooJava.edu.claudio.semana3.PilaresPoo.Herança;

public class ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validacaoInternet();
        System.out.println("Mensagem enviada");
        salvarHistorico();
    }
    public void receberMensagem() {
        System.out.println("Mensagem recebida");
    }

    private void validacaoInternet() {
        System.out.println("Validando conexao com internet");
    }
    private void salvarHistorico() {
        System.out.println("Salvando historico da mensagem");
    }
}