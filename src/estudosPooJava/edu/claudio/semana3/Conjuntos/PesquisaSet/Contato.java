package estudosPooJava.edu.claudio.semana3.Conjuntos.PesquisaSet;

import java.util.Objects;

public class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "{ Contato = " + "nome = '" + nome + "', telefone = '" + telefone + "' }";
    }

    // Nao permite telefones iguais
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(telefone, contato.telefone);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(telefone);
    }

    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
