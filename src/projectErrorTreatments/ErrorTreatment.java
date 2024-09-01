import java.util.Scanner;
import java.util.InputMismatchException;

public class ErrorTreatment {
    
    public static void main(String[] args) {
        
        try {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Whats your name? ");
            String name = scanner.next();

        
            System.out.println("Whats your second name? ");
            String secondName = scanner.next();

            System.out.println("Whats your age? ");
            int age = scanner.nextInt();

            System.out.println("What is your height? ");
            double height = scanner.nextDouble();

            System.out.println("Hello " + name + " " + secondName + ", you age is " + age + ", and your height is " + height + "cm \r\n");
        }
        catch(InputMismatchException e) {
            System.err.println("Enter age as a integer");
        }
    }
}

