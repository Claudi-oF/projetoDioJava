package estudosPooJava.edu.claudio.semana3.Conjuntos.PesquisaSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> contatos = new HashSet<>();

    public void adicionarContato(String nome, String telefone) {
        contatos.add(new Contato(nome, telefone));
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosEncontrados = new HashSet<>();
        for (Contato c : contatos) {
            if (c.getNome().startsWith(nome)) { // startsWith() = comeca com
                contatosEncontrados.add(c);
            }
        }
        return contatosEncontrados;
    }

    public Contato atualizarNumeroContato(String nome, String novoTelefone) {
        Contato contatoAtualizado = null;
        if(!contatos.isEmpty()) {
            for(Contato c : contatos) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setTelefone(novoTelefone);
                }
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Claudio", "1234");
        agenda.adicionarContato("Pedro", "9837");
        agenda.adicionarContato("Ana", "5471");

        agenda.exibirContatos();

        System.out.println("Contatos encontrados: " + agenda.pesquisarPorNome("Claudio"));

        agenda.atualizarNumeroContato("Claudio", "0987");

        agenda.exibirContatos();
    }

}
