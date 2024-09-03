package projetoDiagramacaoDeClassesIphone.aparelhoTelefonico;

import projetoDiagramacaoDeClassesIphone.aparelhoTelefonico.Interfaces.Atender;
import projetoDiagramacaoDeClassesIphone.aparelhoTelefonico.Interfaces.IniciarCorreioVoz;
import projetoDiagramacaoDeClassesIphone.aparelhoTelefonico.Interfaces.Ligar;

public class AparelhoTelefonico implements Atender, Ligar, IniciarCorreioVoz {

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    @Override
    public void ligar() {
        System.out.println("LIGANDO");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO");
    }
}
