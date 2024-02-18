

import java.util.Scanner;

class MaxRetriesExceededException extends Exception {
    public MaxRetriesExceededException(String message) {
        super(message);
    }
}

public class PS13{

    public static void main(String[] args) {
        // Question 1: Syntax Error
        // int a = 7; 

        // Logical Error
        int age = 78;
        int year_born = 2000 - age; // Corrected logical error

        // Arithmetic Exception
        try {
            int a = 666 / 0; // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("Haha");
        }

        // Illegal Argument Exception
        try {
            int[] arr = new int[5];
            int value = arr[-1]; // Trying to access an invalid index
        } catch (IllegalArgumentException e) {
            System.out.println("HeHe");
        }

        // Problem 3 & 4
        try {
            performOperationWithRetry();
        } catch (MaxRetriesExceededException e) {
            System.out.println(e.getMessage());
        }

        // Problem 5
        try {
            performOperationWithCustomException();
        } catch (MaxRetriesExceededException e) {
            System.out.println(e.getMessage());
        }
    }

    // Problem 3 & 4
    public static void performOperationWithRetry() throws MaxRetriesExceededException {
        boolean flag = true;
        int[] marks = {7, 56, 6};
        Scanner scanner = new Scanner(System.in);
        int index;
        int retries = 0;
        while (flag && retries < 5) {
            try {
                System.out.println("Enter the index:");
                index = scanner.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid Index");
                retries++;
            }
        }
        if (retries >= 5) {
            throw new MaxRetriesExceededException("Errors: Max retries exceeded");
        }
    }

    // Problem 5
    public static void performOperationWithCustomException() throws MaxRetriesExceededException {
        boolean flag = true;
        int[] marks = {7, 56, 6};
        Scanner scanner = new Scanner(System.in);
        int index;
        int retries = 0;
        while (flag && retries < 5) {
            try {
                System.out.println("Enter the index:");
                index = scanner.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid Index");
                retries++;
            }
        }
        if (retries >= 5) {
            throw new MaxRetriesExceededException("Errors: Max retries exceeded");
        }
    }
}
