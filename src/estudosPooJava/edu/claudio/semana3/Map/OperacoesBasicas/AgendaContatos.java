package estudosPooJava.edu.claudio.semana3.Map.OperacoesBasicas;

import estudosPooJava.edu.claudio.semana3.Conjuntos.PesquisaSet.Contato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo

    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionaContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatosMap.isEmpty()) {
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionaContato("Rosangela", 992690531);
        agendaContatos.adicionaContato("Pai", 998765541);
        agendaContatos.adicionaContato("Mae", 992690561);

        System.out.println(agendaContatos.pesquisarPorNome("Rosangela"));
        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Pai");
        agendaContatos.exibirContatos();
    }
}
