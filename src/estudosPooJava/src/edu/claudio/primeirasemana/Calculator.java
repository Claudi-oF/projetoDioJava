package edu.claudio.primeirasemana;
import java.util.Scanner;

public class Calculator {
    public static void main (String [] args) {

        CalculatorNumbers();

    }

    public static void CalculatorNumbers () {

        double firstNumber;
        double secondNumber;
        String operation;

        Scanner read = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("Welcome to Calculator!!!");
        System.out.println("========================");

        System.out.println("Enter the operation: ");
        System.out.println("+ for sum: ");
        System.out.println("- for subtraction: ");
        System.out.println("x for multiplication: ");
        System.out.println("/ for divide: ");
        operation = read.nextLine();

        System.out.println("Enter the first number: ");
        firstNumber = read.nextDouble();
        System.out.println("Enter the second number");
        secondNumber = read.nextDouble();

        if(secondNumber == 0) {
            while (secondNumber == 0) {
                System.out.println("Invalid number!! Try another");
                secondNumber = read.nextDouble();
            }
        } 

        switch (operation) {
            case "+":
                System.out.println("The result of " + firstNumber + " " + operation + " " + secondNumber + " is: " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("The result of " + firstNumber + " " + operation + " " + secondNumber + " is: " + (firstNumber - secondNumber)); 
                break;
            case "*":
                System.out.println("The result of " + firstNumber + " " + operation + " " + secondNumber + " is: " + (firstNumber * secondNumber));
                break;
            case "/":
                System.out.println("The result of " + firstNumber + " " + operation + " " + secondNumber + " is: " + (firstNumber / secondNumber));
                break;
            default:
                System.out.println("Invalid operation");
        }

    }

}
