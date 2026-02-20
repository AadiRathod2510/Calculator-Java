package Project_Calculator;

/**
 * Class Name: DivisionException

 * Responsibility:
 * Represents an error condition where division by zero
 * is attempted in the calculator.

 * Key Features:
 * - Custom exception for division-by-zero scenarios
 * - Provides a user-friendly error message

 * Designed for:
 * OOP Calculator – Exception handling for invalid division
 */

public class DivisionException extends Exception {

    // Returns a descriptive error message for division by zero and return error message string
    @Override
    public String getMessage() {
        return "Division by 0 not possible";
    }
}
