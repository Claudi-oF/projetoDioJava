import java.util.Scanner;

public class AccountTerminal {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Whats your number? ");
        int number = scanner.nextInt();

        System.out.println("Whats your agency? ");
        String agency = scanner.next();

        System.out.println("Whats your name? ");
        String name = scanner.next();

        System.out.println("What is your balance?? ");
        double balance = scanner.nextDouble();

        System.out.println("Hello " + name + ", thank you for create a bank account with us, your agency is " + agency + " , account " + number + ", and your balance " + balance + ", is now avaliable for withdrawal.\r\n");

    }
}
