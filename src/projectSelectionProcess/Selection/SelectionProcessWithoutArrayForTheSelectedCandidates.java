package projectSelectionProcess.Selection;
import java.util.Scanner;

public class SelectionProcessWithoutArrayForTheSelectedCandidates {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Type your required salary");
        double requiredSalary = scanner.nextDouble();

        AnalyzeCandidates(requiredSalary);

    }

    public static void AnalyzeCandidates(double requiredSalary) {
            
        double salaryBase = 2000.0;

        if(salaryBase > requiredSalary) {
            System.out.println("Call the candidate");
        }
        else if(salaryBase == requiredSalary){
            System.out.println("Call the candidate with counter-proposal");
        }
        else {
            System.out.println("Waiting results to the others candidates");
        }
    }
    

}
