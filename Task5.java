class MaxInputException extends Exception {
    public MaxInputException(String message) {
        super(message);
    }
}

class CannotDivideByZeroException extends Exception {
    public CannotDivideByZeroException(String message) {
        super(message);
    }
}

class MaxMultiplierReachedException extends Exception {
    public MaxMultiplierReachedException(String message) {
        super(message);
    }
}

public class Task5 {
    public static int add(int a, int b) throws MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException("Max Input Exception: Inputs cannot be greater than 100000");
        }
        return a + b;
    }

    public static int subtract(int a, int b) throws MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException("Max Input Exception: Inputs cannot be greater than 100000");
        }
        return a - b;
    }

    public static int multiply(int a, int b) throws MaxInputException, MaxMultiplierReachedException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException("Max Input Exception: Inputs cannot be greater than 100000");
        }
        if (a > 7000 || b > 7000) {
            throw new MaxMultiplierReachedException("Max Multiplier Reached Exception: Multiplication inputs cannot be greater than 7000");
        }
        return a * b;
    }

    public static int divide(int a, int b) throws CannotDivideByZeroException, MaxInputException {
        if (b == 0) {
            throw new CannotDivideByZeroException("Cannot Divide By Zero Exception: Denominator cannot be zero");
        }
        if (a > 100000 || b > 100000) {
            throw new MaxInputException("Max Input Exception: Inputs cannot be greater than 100000");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            // Example usage:
            int result = add(10, 20);
            System.out.println("Addition Result: " + result);

            result = subtract(50, 30);
            System.out.println("Subtraction Result: " + result);

            result = multiply(100, 70);
            System.out.println("Multiplication Result: " + result);

            result = divide(100, 10);
            System.out.println("Division Result: " + result);

            // Uncomment to test exceptions
            // result = add(1000000, 2000000);
            // result = multiply(8000, 8000);
            // result = divide(10, 0);

        } catch (MaxInputException | MaxMultiplierReachedException | CannotDivideByZeroException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
