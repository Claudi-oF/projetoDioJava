package projectCompilingOnTerminal;

import java.util.Locale;
import java.util.Scanner;

public class UsingScanner {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("What is your name? ");
        String name = scanner.next();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        //prints das variaveis 
        System.out.println("Hello, my name is " + name);
        System.out.println("I have " + age + " years old");

    }
}
