
import java.util.Scanner;

public class PS12p2 {
    protected int proInt =4;
    int defInt =41;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);
        scanner.close();
    }
}
