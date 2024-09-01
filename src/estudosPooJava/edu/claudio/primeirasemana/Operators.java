package edu.claudio.primeirasemana;

public class Operators {
    public static void main (String [] args) {
        int numberOne = 1;
        System.out.println(numberOne += ++numberOne );

        int numberTwo = 2;
        System.out.println(numberTwo += numberTwo++);
    }
}
