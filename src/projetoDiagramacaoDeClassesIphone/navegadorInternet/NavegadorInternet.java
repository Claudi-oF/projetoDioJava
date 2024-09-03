package projetoDiagramacaoDeClassesIphone.navegadorInternet;

import projetoDiagramacaoDeClassesIphone.navegadorInternet.Interfaces.AdicionarAba;
import projetoDiagramacaoDeClassesIphone.navegadorInternet.Interfaces.AtualizarPagina;
import projetoDiagramacaoDeClassesIphone.navegadorInternet.Interfaces.ExibirAba;

public class NavegadorInternet implements AdicionarAba, AtualizarPagina, ExibirAba  {

    @Override
    public void exibirAba() {
        System.out.println("EXIBINDO ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA");
    }

    @Override
    public void adicionarAba() {
        System.out.println("ADICIONANDO ABA");
    }
    
}
