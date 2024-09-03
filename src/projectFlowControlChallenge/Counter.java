package projectFlowControlChallenge;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) throws Exception {
        
        try {
            RecievesParameters();
        } catch (InvalidParametersException e) {
            System.out.println("The second parameter must be greater than the first.");
        }
    }

    public static void RecievesParameters() throws InvalidParametersException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Type the first parameter: ");
        int firstParameter = scanner.nextInt();
        System.out.println("Type the second parameter: ");
        int secondParameter = scanner.nextInt();

        if(secondParameter >= firstParameter) {
            for (int i = firstParameter; i <= secondParameter; i++) {
                System.out.printf("Printing the number %d", i);
                System.out.println("");
            }
        } else {
            throw new InvalidParametersException("The second parameter must be greater than the first.");
        }

    }
}
