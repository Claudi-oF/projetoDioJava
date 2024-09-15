package estudosPooJava.edu.claudio.semana3.Conjuntos.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos(){
        this.produtos = new HashSet<>();
    }
    public void adicionarProduto(String nome, long codigo, int quantidade, double preco ) {
        produtos.add(new Produto(nome, codigo, quantidade, preco));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtos);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtos);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("Macarrao", 4, 2, 1.50);
        cadastroProdutos.adicionarProduto("Pao", 2, 10, 9.50);
        cadastroProdutos.adicionarProduto("Bacalhau", 8, 1, 10);
        cadastroProdutos.adicionarProduto("Alface", 5, 30, 20);

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
    }
}
