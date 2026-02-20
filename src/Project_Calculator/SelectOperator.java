package Project_Calculator;

import java.util.*;

/**
 * Class Name: SelectOperator

 * Responsibility:
 * Handles operator selection and normalization for calculator operations.

 * Key Features:
 * - Accepts operator input from the user
 * - Normalizes input to lowercase for consistent processing
 * - Separates operator handling from calculation logic

 * Designed for:
 * OOP Calculator – Operator selection component
 */

public class SelectOperator {
    private Scanner sc;

    // Stores the operator selected by the user
    private String choice;

    // Initializes SelectOperator with a shared Scanner instance.
    public SelectOperator(Scanner sc){
        this.sc = sc;
    }

    // Reads and returns the operator chosen by the user and return normalized operator string
    public String selectingOperator(){
        choice = sc.next();
        choice = choice.toLowerCase();
        return choice;
    }
}
