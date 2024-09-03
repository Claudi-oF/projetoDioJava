package estudosGettersSetters.PilaresDaPoo;

public class Autodromo {
    public static void main(String[] args) {
        Carro lamborghini = new Carro();
        lamborghini.setChassi("128371");
        lamborghini.Ligar();

        Moto kawasaki = new Moto();
        kawasaki.setChassi("86541");
        kawasaki.Ligar();

        Veiculo veiculoAleatorio = lamborghini;

        veiculoAleatorio.Ligar();

    }
}
