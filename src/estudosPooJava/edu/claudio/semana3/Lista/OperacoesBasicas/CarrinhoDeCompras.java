package estudosPooJava.edu.claudio.semana3.Lista.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class CarrinhoDeCompras {
    private static List<Item> itemDescricao;

    public CarrinhoDeCompras(){
        this.itemDescricao =  new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        itemDescricao.add(item);
    }   

    public void removerItem(String nome) {
        Iterator<Item> itensParaRemover = itemDescricao.iterator();

        while(itensParaRemover.hasNext()) {
            Item item = itensParaRemover.next();
            if(item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.remove();
                return;
            }
        }
        System.out.println("Item com o nome" + nome + " nao encontrado no carrinho");
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (Item item : itemDescricao) {
            total =+ item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        if(itemDescricao.isEmpty()) {
            System.out.println("O carrinho esta vazio!");
        } else {
            for (Item item : itemDescricao) {
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras tarefaItem = new CarrinhoDeCompras();

        System.out.println("Adicionando item ao carrinho: ");
        tarefaItem.adicionarItem("Macarrao", 5.00, 4);
        tarefaItem.adicionarItem("Biscoito", 2.00, 10);
        tarefaItem.adicionarItem("Sorvete", 30.00, 1);

        System.out.println("Exibindo itens do carrinho: ");
        tarefaItem.exibirItens();

        System.out.println("Retirando item do carrinho: ");
        tarefaItem.removerItem("Macarrao");

        System.out.println("Itens do carrinho apos a remocao: ");
        tarefaItem.exibirItens();

        System.out.println("Valor total dos itens no carrinho: ");
        tarefaItem.calcularValorTotal();
    }

}
