package Project_Calculator;

/**
 * Class Name: ModulusException

 * Responsibility:
 * Represents an error condition where a modulus operation
 * is attempted with zero as the divisor.

 * Key Features:
 * - Custom exception for modulus-by-zero scenarios
 * - Provides a clear and user-friendly error message

 * Designed for:
 * OOP Calculator – Exception handling for invalid modulus operations
 */

public class ModulusException extends Exception {

    // Returns a descriptive error message for modulus by zero and return error message string
    @Override
    public String getMessage() {
        return "Modulus by 0 not possible";
    }
}
