package estudosPooJava.edu.claudio.semana3.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidados> convidado = new HashSet<>();

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidado.add(new Convidados(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoDeConvite(int codigoConvite) {
        Convidados convidadosRemovidos = null;
        for(Convidados c: convidado) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadosRemovidos = c;
                break;
            }
        }
        convidado.remove(convidadosRemovidos);
    }

    public int contarConvidados() {
        return convidado.size();
    }

    public Set<Convidados> exibirConvidados() {
        return convidado;
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Maria", 1);
        conjuntoConvidados.adicionarConvidado("Jose", 18);
        conjuntoConvidados.adicionarConvidado("Pedro", 18); // nao sera salvo, pois tem codigo igual ao Jose
        conjuntoConvidados.adicionarConvidado("Fabio", 4);

        System.out.println(conjuntoConvidados.exibirConvidados());

        conjuntoConvidados.removerConvidadoPorCodigoDeConvite(18);

        System.out.println(conjuntoConvidados.exibirConvidados());
        System.out.println(conjuntoConvidados.contarConvidados());
    }

}
