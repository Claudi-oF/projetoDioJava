package estudosPooJava.edu.claudio.semana3.Lista.PesquisaEmList;

public class Livro {
    //atributos
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }


    //get, set livro
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //get, set autor
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    //get, set ano
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    @Override
    public String toString() {
        return "Livro{" + 
            "titulo='" + titulo + "autor='" + autor + "ano='" + ano + '\'' +   
        '}';
    }

}
