import java.util.Scanner;

public class MediaCalculator {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] students = {"Geovana", "Maria", "Beatriz", "Mario"};

        double media = CalculateClassAverage(students, scan); 

        System.out.printf("Class average: %s", media);

    }

    public static double CalculateClassAverage(String[] students, Scanner scan) {

        double sum = 0;

        for(String student : students) {
            System.out.printf("Student's grade: %s \r\n", student);
            double grade = scan.nextInt();
            sum += grade;

        }

        return sum / students.length;

    }
}
