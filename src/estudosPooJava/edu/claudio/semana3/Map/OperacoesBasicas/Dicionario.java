package estudosPooJava.edu.claudio.semana3.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> palavrasDicionario;

    public Dicionario() {
        this.palavrasDicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        this.palavrasDicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        this.palavrasDicionario.remove(palavra);
    }

    public void exibirPalavras() {
        System.out.println(palavrasDicionario);
    }

    public void pesquisarPorPalavra(String palavra) {
        for (Map.Entry<String, String> palavraEntry : palavrasDicionario.entrySet()) {
            if (palavraEntry.getKey().equalsIgnoreCase(palavra)) {
                System.out.println(palavraEntry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Palavra 1", "Definicao 1");
        dicionario.adicionarPalavra("Palavra 2", "Definicao 2");
        dicionario.adicionarPalavra("Palavra 3", "Definicao 3");
        dicionario.adicionarPalavra("Palavra 4", "Definicao 4");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Palavra 1");

        dicionario.exibirPalavras();

        dicionario.pesquisarPorPalavra("Palavra 3");
    }

}
