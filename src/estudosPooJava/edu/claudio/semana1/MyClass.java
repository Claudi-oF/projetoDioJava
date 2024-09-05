package estudosPooJava.edu.claudio.semana1;
public class MyClass {
   
    public static void main (String [] args) {
        String firstName = "Rafael";
        String secondName = "Matheus";

        String fullName = ReturnNames(firstName, secondName);
        System.out.println(fullName);
    }

    public static String ReturnNames(String firstName, String secondName) {
        return firstName.concat(" ").concat(secondName);
    }

}