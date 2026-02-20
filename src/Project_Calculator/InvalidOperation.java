package Project_Calculator;

/**
 * Class Name: InvalidOperation

 * Responsibility:
 * Represents an exception thrown when the user enters
 * an unsupported or invalid operator.

 * Key Features:
 * - Signals invalid operator selection
 * - Provides a meaningful error message
 * - Helps maintain clean control flow
 */

public class InvalidOperation extends Exception {

    // Returns a descriptive error message for invalid operations and return error message string
    @Override
    public String getMessage() {
        return "Select valid operation";
    }
}
