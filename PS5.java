import java.util.Scanner;

public class PS5 {
    public static void main(String[] args) {

        // Q1. Pattern
        int patternN = 4;
        for (int i = patternN; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // Q2. Sum of first m numbers
        int sum = 0;
        int sumN = 5;
        for (int i = 0; i < sumN; i++) {
            sum = sum + (2 * i);
        }
        System.out.print("Sum of even numbers is: ");
        System.out.println(sum);

        // Q3. Multiplication Table
        int multiplicationN = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", multiplicationN, i, multiplicationN * i);
        }

        // Q4. Multiplication Table Reverse Order
        int reverseMultiplicationN = 10;
        for (int i = 10; i >= 1; i--) {
            System.out.printf("%d X %d = %d\n", reverseMultiplicationN, i, reverseMultiplicationN * i);
        }

        // Q5. Factorial for loop
        int number = 5;
        int factoriala = 1;
        for (int i = 1; i <= number; i++) {
            factoriala *= i;
        }
        System.out.println("Factorial of " + number + " is: " + factoriala);

        // Q6. Factorial while loop
        int factorialN = 5;
        int j = 1;
        int factorial = 1;
        while (j <= factorialN) {
            factorial *= j;
            j++;
        }
        System.out.println(factorial);

        // Q7. Pattern while loop
        int patternN1 = 4;
        int i = patternN1;
        while (i > 0) {
            int j1 = 0;
            while (j1 < i) {
                System.out.print("*");
                j1++;
            }
            System.out.print("\n");
            i--;
        }

        // Q8. T or F
        // TRUE

        // Q9. Sum in 8s Table
        int problem9N = 8;
        int problem9Sum = 0;
        for (int i1 = 1; i1 <= 10; i1++) {
            problem9Sum += problem9N * i1;
        }
        System.out.println(problem9Sum);
    }
}
