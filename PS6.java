import java.util.Scanner;

public class PS6 {
    public static void main(String[] args) {
        // Q1. Float array and sum
        float[] marksQ1 = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sumQ1 = 0;
        for (float element : marksQ1) {
            sumQ1 += element;
        }
        System.out.println("The value of sum is " + sumQ1);

        // Q2. find given element is in array
        float[] marksQ2 = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float numQ2 = 45.57f;
        boolean isInArrayQ2 = false;
        for (float element : marksQ2) {
            if (numQ2 == element) {
                isInArrayQ2 = true;
                break;
            }
        }
        if (isInArrayQ2) {
            System.out.println("The value is present in the array");
        } else {
            System.out.println("The value is not present in the array");
        }

        // Q3. Avg marks in Phy
        float[] marksQ3 = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sumQ3 = 0;
        for (float element : marksQ3) {
            sumQ3 += element;
        }
        System.out.println("The value of average marks is " + sumQ3 / marksQ3.length);

        // Q4 Matrix addition
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] mat2 = {{2, 6, 13}, {3, 7, 1}};
        int[][] result = new int[mat1.length][mat1[0].length];

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(""); // Prints a new line
        }

        // Q5. Reverse array
        int[] arrQ5 = {1, 21, 3, 4, 5, 34, 67};
        int lQ5 = arrQ5.length;
        int nQ5 = lQ5 / 2;
        int tempQ5;

        for (int i = 0; i < nQ5; i++) {
            tempQ5 = arrQ5[i];
            arrQ5[i] = arrQ5[lQ5 - i - 1];
            arrQ5[lQ5 - i - 1] = tempQ5;
        }

        for (int element : arrQ5) {
            System.out.print(element + " ");
        }

        // Q6. Max element
        int[] arrQ6 = {1, 2100, 3, 455, 5, 34, 67};
        int maxQ6 = Integer.MIN_VALUE;
        for (int e : arrQ6) {
            if (e > maxQ6) {
                maxQ6 = e;
            }
        }
        System.out.println("\nThe value of the maximum element in this array is: " + maxQ6);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        // Q7. Check if the array is sorted
        boolean isSortedQ7 = true;
        int[] arrQ7 = {1, 12, 3, 4, 5, 34, 67};
        for (int i = 0; i < arrQ7.length - 1; i++) {
            if (arrQ7[i] > arrQ7[i + 1]) {
                isSortedQ7 = false;
                break;
            }
        }
        if (isSortedQ7) {
            System.out.println("The Array is sorted");
        } else {
            System.out.println("The Array is not sorted");
        }

      
    }
}
