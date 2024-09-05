package estudosPooJava.edu.claudio.semana3.PilaresPoo.Polimorfismo.Apps;

public abstract class ServicoMensagemInstantaneaPolimorfismo {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //somente os filhos conhecem esse metodo
    protected void validarConectadoInternet() {
        System.out.println("Validando se esta conectado a internet");
    }

}