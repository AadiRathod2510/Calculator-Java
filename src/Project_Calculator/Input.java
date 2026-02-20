package Project_Calculator;

import java.util.*;

/**
 * Class Name: Input

 * Responsibility:
 * Handles all numeric input operations required by the calculator.

 * Key Features:
 * - Accepts numeric values from the user
 * - Separates input logic from calculation logic
 * - Reuses a shared Scanner instance

 * Designed for:
 * OOP Calculator – User input handling component
 */

public class Input {
    private Scanner sc;

    // Stores user-entered numbers
    private double num1,num2;

    // Initializes Input with a shared Scanner object.
    public Input(Scanner sc){
        this.sc = sc;
    }

    // Takes the first numeric input from the user and return first number entered by the user
    public double takingInputOfNumber1(){
        System.out.print("Enter number 1: ");
        num1 = sc.nextDouble();
        return num1;
    }

    // Takes the second numeric input from the user and return second number entered by the user
    public double takingInputOfNumber2(){
        System.out.print("Enter number 2: ");
        num2 = sc.nextDouble();
        return num2;
    }
}
