package estudosPooJava.edu.claudio.semana3.Map.PesquisaMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ContagemPalavras {
    Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        palavras.remove(palavra);
    }

    public void exibirContagemPalavras() {
        System.out.println(palavras.size());
    }

    public void encontrarPalavraMaisFrequente() {
        int maiorContagem = Integer.MIN_VALUE;
        String palavraMaiorContagem = null;
        for(Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if(entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaiorContagem = entry.getKey();
            }
        }
        System.out.println(palavraMaiorContagem);
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("amor", 100);
        contagemPalavras.adicionarPalavra("confiar", 200);
        contagemPalavras.adicionarPalavra("felicidade", 50);
        contagemPalavras.adicionarPalavra("garrafa", 2);
        contagemPalavras.adicionarPalavra("sonhar", 78);
        contagemPalavras.adicionarPalavra("fazer", 234);
        contagemPalavras.adicionarPalavra("comer", 6);
        contagemPalavras.adicionarPalavra("obrigado", 41);

        contagemPalavras.exibirContagemPalavras();
        contagemPalavras.encontrarPalavraMaisFrequente();
        contagemPalavras.removerPalavra("confiar");
        contagemPalavras.exibirContagemPalavras();
        contagemPalavras.encontrarPalavraMaisFrequente();

    }

}
