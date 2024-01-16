
import java.util.Scanner;
public class PS2 {
    public static void main(String[] args)
    {
        // Q1. Result of expression
        float a= (7/4.0f)*(9/2.0f);
        System.out.println("Result of expression is " + a);

        //Q2. Encrypt and Decrypt grade
        char grade = 'B';
        grade = (char)(grade+8);
        System.out.println("encrypted grade:" + grade);
        grade = (char)(grade-8);
        System.out.println("decrypted grade:" + grade);

        //Q3. Comparison of numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no:");
        int no= sc.nextInt();
        System.out.println(no>8);

        //Q4. Expression
        float v = 10;
        float u = 2;
        float ab = 5;
        float s = 4;
        float result = (v * v - u * u) / (2 * ab * s);
        System.out.println(result);

        //Q5. Value of expression

        int x =7;
        int ac = ((7*49)/7)+ (35/7);
        System.out.println(ac);

    }
    
}
