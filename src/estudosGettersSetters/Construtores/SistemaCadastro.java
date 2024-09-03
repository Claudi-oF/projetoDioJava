package estudosGettersSetters.Construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa rafael = new Pessoa("Rafael", "92877664419");

        rafael.setEndereco("rua magalhaes");

        // como definir nome e cpf sem o setters ??

        System.out.println(rafael.getNome() + " - " + rafael.getCpf());
    } 
}
