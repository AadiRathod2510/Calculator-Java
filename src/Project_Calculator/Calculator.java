package Project_Calculator;

import java.util.*;

/**
 * Class Name: Calculator

 * Responsibility:
 * Acts as the entry point and main controller for the console-based
 * OOP Calculator application.

 * Key Features:
 * - Displays available operations to the user
 * - Handles unary and binary calculations
 * - Coordinates input, operator selection, and execution flow
 * - Manages exception handling for invalid input and operations
 */

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;


        double num1,num2;
        SelectOperator objOperator = new SelectOperator(sc);
        Input objInput = new Input(sc);
        do {
            System.out.print("+,-,*,/,%,S(For Square),C(For Cube),R(For Square Root),Q(For Cube Root),E(To Exit): ");
            choice = objOperator.selectingOperator();

            if (choice.equals("e")) {
                System.out.println("Exiting the calculator...");
            }

            // Unary operations
            else if(choice.equals("s") || choice.equals("c") || choice.equals("r") || choice.equals("q")){
                try{
                    num1 = objInput.takingInputOfNumber1();
                    switch (choice){
                        case "s":
                            System.out.println("Square of " + num1 + " is: " + (num1 * num1));
                            break;
                        case "c":
                            System.out.println("Cube of " + num1 + " is: " + (num1 * num1 * num1));
                            break;
                        case "r":
                            if(num1 < 0){
                                throw new NegativeNumberException();
                            }
                            System.out.println("SquareRoot of " + num1 + " is: " + (Math.sqrt(num1)));
                            break;
                        case "q":
                            System.out.println("CubeRoot of " + num1 + " is: " + (Math.cbrt(num1)));
                            break;
                    }
                }
                catch (InputMismatchException e){
                    System.out.println("ERROR: Enter Numeric value");
                    sc.nextLine();
                }
                catch (NegativeNumberException e){
                    System.out.println(e.getMessage());
                    sc.nextLine();
                }
            }

            // Binary operations
            else if (choice.equals("+") || choice.equals("-") || choice.equals("*") || choice.equals("/") || choice.equals("%")) {
                try {
                    num1 = objInput.takingInputOfNumber1();
                    num2 = objInput.takingInputOfNumber2();
                    switch (choice) {
                        case "+":
                            System.out.println("Result: " + num1 + " + " + num2 + " = " + (num1 + num2));
                            break;
                        case "-":
                            System.out.println("Result: " + num1 + " - " + num2 + " = " + (num1 - num2));
                            break;
                        case "*":
                            System.out.println("Result: " + num1 + " * " + num2 + " = " + (num1 * num2));
                            break;
                        case "/":
                            if (num2 == 0) {
                                throw new DivisionException();
                            }
                            System.out.println("Result: " + num1 + " / " + num2 + " = " + (num1 / num2));
                            break;
                        case "%":
                            if (num2 == 0) {
                                throw new ModulusException();
                            }
                            System.out.println("Result: " + num1 + " % " + num2 + " = " + (num1 % num2));
                            break;
                    }
                } catch (DivisionException | ModulusException e) {
                    System.out.println(e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("ERROR: Enter Numeric value");
                    sc.nextLine();
                }
            }

            // Invalid operation handling
            else {
                try {
                    throw new InvalidOperation();
                } catch (InvalidOperation e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.println();
        } while (!choice.equals("e"));
        sc.close();
    }
}
