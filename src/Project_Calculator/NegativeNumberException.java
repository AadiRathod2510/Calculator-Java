package Project_Calculator;

/**
 * Class Name: NegativeNumberException

 * Responsibility:
 * Represents an error condition where a square root
 * operation is attempted on a negative number.

 * Key Features:
 * - Prevents invalid square root calculations
 * - Ensures mathematical correctness
 * - Provides a clear and user-friendly error message

 * Designed for:
 * OOP Calculator – Validation of square root operations
 */

public class NegativeNumberException extends Exception{
    // Provides a clear error message explaining why the square root operation is invalid.
    @Override
    public String getMessage(){
        return "Square root of a negative number is not allowed";
    }
}
