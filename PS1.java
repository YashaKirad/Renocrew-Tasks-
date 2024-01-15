import java.util.Scanner;

public class PS1 {
    public static void main(String[] args) {
        

        // Q1. Sum of three Numbers
        int a = 10;
        int b = 7;
        int c = 9;
        int sum = a + b + c;

        System.out.println("The sum of three numbers is " + sum);

        // Q2. Calculate CGPA
        float sub1=89;
        float sub2 =77;
        float sub3=90;
        float CGPA = (sub1+sub2+sub3)/30;
        System.out.println("The CGPA of three subjects is " + CGPA);

        //Q3. Hello User name
        System.out.println("Enter name");
        Scanner sc = new Scanner (System.in);
        String name = sc.next();
        System.out.println("Hello " + name + ", have a good day.");

        //Q.4 Convert km to miles
        System.out.println("Enter distance in kilometers:");
        Scanner sc2 = new Scanner(System.in);
        double kilometers = sc2.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
        
        //Q.5 Detect number is int
        System.out.println("Enter a number:");
        Scanner sc3 = new Scanner(System.in);
        if (sc3.hasNextInt()) {
            int num = sc3.nextInt();
            System.out.println("You entered an integer: " + num);
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }


    }
}
