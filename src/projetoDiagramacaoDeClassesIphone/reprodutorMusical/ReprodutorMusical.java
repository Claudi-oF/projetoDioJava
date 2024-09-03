package projetoDiagramacaoDeClassesIphone.reprodutorMusical;

import projetoDiagramacaoDeClassesIphone.reprodutorMusical.Interfaces.Pausar;
import projetoDiagramacaoDeClassesIphone.reprodutorMusical.Interfaces.SelecionarMusica;
import projetoDiagramacaoDeClassesIphone.reprodutorMusical.Interfaces.Tocar;

public class ReprodutorMusical implements Pausar, SelecionarMusica, Tocar{

    @Override
    public void tocar() {
        System.out.println("TOCANDO");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MUSICA");
    }
    
}
