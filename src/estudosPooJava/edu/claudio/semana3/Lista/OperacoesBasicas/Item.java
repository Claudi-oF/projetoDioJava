package estudosPooJava.edu.claudio.semana3.Lista.OperacoesBasicas;

public class Item {
    //atributos
    private String nome;
    private double preco;
    private int quantidade;

    
    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    //get atributos
    public String getNome() {
        return nome;
    }
    public Double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    //set atributos
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Item{" + 
            "nome='" + nome + "preco='" + preco + "quantidade='" + quantidade +   '\'' +   
        '}';
    }

}
