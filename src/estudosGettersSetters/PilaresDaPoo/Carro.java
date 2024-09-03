package estudosGettersSetters.PilaresDaPoo;

public class Carro extends Veiculo {
    
    // Encapsulamento: Nem tudo precisa estar visivel para o usuario
    // confereCambio() e confereCombustivel() foram chamadas automaticamente quando o 
    // usuario ligou o carro

    public void Ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }

    private void confereCambio() {
        System.out.println("conferindo cambio");
    }

    private void confereCombustivel() { 
        System.out.println("conferindo combustivel");
    }

}
