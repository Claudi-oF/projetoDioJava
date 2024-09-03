package projectSelectionProcess.Selection;
import java.util.concurrent.ThreadLocalRandom;

public class SelectionProcessWithArrayForTheSelectedCandidates {
    public static void main(String[] args) {
        SelectCandidates();
    }

    public static void SelectCandidates() {
        String[] candidates = {"Maria", "Joao", "Fernando", "Thawanne", "Josue", "Leandro", "Samara", "Jose", "Claudio", "Felipe"};
        String[] selectedCandidates = new String[5];

        int counterSelectCandidates = 0;
        int counterCandidates = 0;
        double salaryBase = 2000.0;

        while(counterSelectCandidates < 5 && counterCandidates < candidates.length) {
            
            String candidate = candidates[counterCandidates];

            System.out.printf("The atual candidate is: %s \r\n", candidate);

            double requiredSalary = TargetValue();

            AnalyzeCandidates(requiredSalary);

            System.out.println("\r\n");

            if(salaryBase >= requiredSalary) {
                selectedCandidates[counterSelectCandidates] = candidate;
                counterSelectCandidates++;
            }

            counterCandidates++;
        }

        System.out.println("\r\n");

        System.out.println("Candidates selected: ");

        for(int i=0; i < counterSelectCandidates; i++) {
            System.out.printf(selectedCandidates[i] + " ");
        }

        System.out.println("\r\n");

        int attemptCalls = 0;
        int randomNumber = 0;

        for(int i=0; i < counterSelectCandidates; i++) {
            System.out.printf("The candidate that human resources will call: %s ", selectedCandidates[i]);

            while (attemptCalls < 3) {
                randomNumber = ThreadLocalRandom.current().nextInt(0, 2);
                if(randomNumber == 1) {
                    attemptCalls++;
                    
                    break;
                }

                else {
                    attemptCalls++;
                }
            } 
            
            
            if(randomNumber == 1) {
                System.out.printf("We managed to contact %s after %d attempts", selectedCandidates[i], attemptCalls);   
            }else {
                System.out.printf("Not managed to contact with the %s", selectedCandidates[i]);

            }

            System.out.println("\r\n");

            attemptCalls = 0;
        }

    }

    public static double TargetValue() {
        return ThreadLocalRandom.current().nextDouble(1950, 2200);
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
