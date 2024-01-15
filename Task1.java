import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for Subject 1 (out of 100):");
        double subject1Marks = scanner.nextDouble();
        System.out.println("Enter marks for Subject 2 (out of 100):");
        double subject2Marks = scanner.nextDouble();
        System.out.println("Enter marks for Subject 3 (out of 100):");
        double subject3Marks = scanner.nextDouble();
        System.out.println("Enter marks for Subject 4 (out of 100):");
        double subject4Marks = scanner.nextDouble();
        System.out.println("Enter marks for Subject 5 (out of 100):");
        double subject5Marks = scanner.nextDouble();
        double percent = ((subject1Marks + subject2Marks + subject3Marks+ subject4Marks + subject5Marks)/ 500)*100;
        System.out.println("Percentage: " + percent);
    }
    
}
