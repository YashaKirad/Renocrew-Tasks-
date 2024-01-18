import java.util.Scanner;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rar = new Random();
        int count = 0;

        int rounds = 5;
        while (rounds > 0) {
            int value = rar.nextInt(4);
            int input = sc.nextInt();
            
            switch (input) {
                case 1:
                    if (value == 0) {
                        System.out.println("Draw");
                    } else if (value == 1) {
                        System.out.println("Lose");
                        count -=1;
                    } else {
                        System.out.println("Win");
                        count+=1;
                    }
                    break;
                case 2:
                    if (value == 0) {
                        System.out.println("Win");
                        count+=1;
                    } else if (value == 1) {
                        System.out.println("Draw");
                    } else {
                        System.out.println("Lose");
                        count -=1;
                    }
                    break;
                case 3:
                    if (value == 0) {
                        System.out.println("Lose");
                        count -=1;
                    } else if (value == 1) {
                        System.out.println("Win");
                        count+=1;
                    } else {
                        System.out.println("Draw");
                    }
                    break;
                default:
                    System.out.println("enter in range 1-3");
                    break;
            }
            
            rounds--;
        }
        System.out.println("Total wins: "+count);
    }
}