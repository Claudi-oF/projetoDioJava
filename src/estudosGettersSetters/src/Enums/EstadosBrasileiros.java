package Enums;

public enum EstadosBrasileiros {
    SAO_PAULO("SP", "São Paulo", 10),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro", 11), 
    PIAUI("PI", "Piauí", 12), 
    GOIAS("GO", "Goiás", 13);

    private String nome;
    private String sigla;
    private int ibge;

    private EstadosBrasileiros (String sigla, String nome, int ibge) {
        this.nome = nome;
        this.sigla = sigla;
        this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

}
