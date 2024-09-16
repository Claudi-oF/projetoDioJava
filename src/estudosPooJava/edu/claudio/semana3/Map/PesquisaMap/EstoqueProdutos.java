package estudosPooJava.edu.claudio.semana3.Map.PesquisaMap;

import estudosPooJava.edu.claudio.semana3.Conjuntos.Ordenacao.Produto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, ProdutosMap> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        estoqueProdutosMap.put(codigo, new ProdutosMap(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double total = 0d;
        if(!estoqueProdutosMap.isEmpty()) {
            for (ProdutosMap p : estoqueProdutosMap.values()) {
                total += (p.getQuantidade() * p.getPreco());
            }
        }
        return total;
    }

    public double obterProdutoMaisCaro() {
        double maiorPreco = Double.MIN_VALUE;
        for (ProdutosMap produto : estoqueProdutosMap.values()) {
            if (produto.getPreco() > maiorPreco) {
                maiorPreco = produto.getPreco();
            }
        }
        return maiorPreco;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1, "Chave de fenda", 15.00, 1);
        estoqueProdutos.adicionarProduto(2, "Veda rosca", 4.00, 4);
        estoqueProdutos.adicionarProduto(3, "Teclado gaymer", 199.90, 1);

        System.out.println(estoqueProdutos.calcularValorTotalEstoque());
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());

    }

}
