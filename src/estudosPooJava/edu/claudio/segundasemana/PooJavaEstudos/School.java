package estudosPooJava.edu.claudio.segundasemana.PooJavaEstudos;

import java.awt.Color;

public class School {
    public static void main(String[] args) throws Exception {
        
        //student1 = Objeto
        //student1.name, .age ... = estados
        Student student1 = new Student();

        student1.name = "Joao";
        student1.age = 10;
        student1.color = Color.BLACK;
        student1.sex = Sex.MALE;

        Student student2 = new Student();

        student1.name = "Jose";
        student1.age = 10;
        student1.color = Color.BLACK;
        student1.sex = Sex.MALE;

        Student student3 = new Student();

        student1.name = "Maria";
        student1.age = 10;
        student1.color = Color.BLACK;
        student1.sex = Sex.FEMALE;
    }
}
