package PilaresDaPoo;

public abstract class Veiculo {
    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    // Abstracao: Maneiras diferentes para se realizar a mesma acao.
    public abstract void Ligar();

}
