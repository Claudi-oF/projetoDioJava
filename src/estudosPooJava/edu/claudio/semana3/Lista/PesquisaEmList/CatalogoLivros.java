package estudosPooJava.edu.claudio.semana3.Lista.PesquisaEmList;

import java.util.List;
import java.util.ArrayList; 

public class CatalogoLivros {
    private List<Livro> catalogo = new ArrayList<>(); 

    public void adicionarLivro(Livro livro) {
        if(!catalogo.contains(livro)) {
            catalogo.add(livro);
        } else {
            System.out.println("Esse livro ja esta contido no catalogo!");
        }
    }

    public Livro pesquisarPorAutor(String autor) {
        for(Livro livro : catalogo) {
            if(livro.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(livro.getTitulo());
            } 
        }
        return null;
    }

    public Livro pesquisarPorIntervaloAno(int anoInicial, int anoFinal) {
        for(Livro livro : catalogo) {
            if(livro.getAno() >= anoInicial && livro.getAno() <= anoFinal) {
                System.out.println(livro.getTitulo());
            } 
        }
        return null;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        for(Livro livro : catalogo) {
            if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(livro.getTitulo());
            } 
        }
        return null;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        System.out.println("Adicionar livros: ");
        Livro livro = new Livro("Harry Potter", "J. K. Rowling", 1997);
        catalogoLivros.adicionarLivro(livro);
        new Livro("Senhor dos Anéis", "J. R. R. Tolkien", 1954);
        catalogoLivros.adicionarLivro(livro);
        
        System.out.println("Procurar livro por titulo: ");
        catalogoLivros.pesquisarPorTitulo("Harry Potter");

        System.out.println("Procurar livro por Autor: ");
        catalogoLivros.pesquisarPorAutor("J. K. Rowling");

        System.out.println("Procurar livro por Ano: ");
        catalogoLivros.pesquisarPorIntervaloAno(1990, 2000);

    }

}
