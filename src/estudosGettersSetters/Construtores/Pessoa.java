package Construtores;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;


    // metodo construtor 
    // o nome deverá ser igual ao nome da classe
    // agora na classe SistemaCadastro quando foi criar um objeto da Classe Pessoa, 
    // temos que colocar dois parâmetros (nome, cpf)

    public Pessoa (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // this.endereco = private String endereco
    // cade o setters de nome e cpf ??

}
