package projetoDiagramacaoDeClassesIphone.Iphone;

import projetoDiagramacaoDeClassesIphone.aparelhoTelefonico.AparelhoTelefonico;
import projetoDiagramacaoDeClassesIphone.navegadorInternet.NavegadorInternet;
import projetoDiagramacaoDeClassesIphone.reprodutorMusical.ReprodutorMusical;


public class Iphone {
    public static void main(String[] args) {
        NavegadorInternet ni = new NavegadorInternet();

        ni.exibirAba();
        ni.adicionarAba();
        ni.atualizarPagina();

        System.out.println("");

        ReprodutorMusical rm = new ReprodutorMusical();

        rm.tocar();
        rm.pausar();
        rm.selecionarMusica();

        System.out.println("");

        AparelhoTelefonico at = new AparelhoTelefonico();

        at.ligar();
        at.iniciarCorreioVoz();
        at.atender();

    }

}
