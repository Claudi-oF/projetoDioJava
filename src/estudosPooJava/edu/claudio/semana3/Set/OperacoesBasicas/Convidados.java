package estudosPooJava.edu.claudio.semana3.Set.OperacoesBasicas;

import java.util.Objects;

public class Convidados {
    //atributos

    private String nome;
    private int codigoConvite;

    public Convidados(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidados that = (Convidados) o;
        return codigoConvite == that.codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvite);
    }

    @Override
    public String toString() {
        return "{ Convidado = " + "Codigo de convite = '" + codigoConvite + "', Nome = '" + nome + "' }";
    }

}
