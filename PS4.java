import java.util.Scanner;

public class PS4 {
    public static void main(String[] args) {

        //Q1. 
        int a = 10;
        if (a==11)
        System.out.println("I am 11");
        else
        System.out.println("I am not 11");

        //Q2. Student is pass or fail
        byte m1,m2,m3;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter marks in Phy");
        m1=sc1.nextByte();
        System.out.println("Enter marks in Chem");
        m2=sc1.nextByte();
        System.out.println("Enter marks in Maths");
        m3=sc1.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your Overall percentage is: " + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations, You have been promoted");
        }
        else{
            System.out.println("Sorry, You have not been promoted! Please try again.");
        }

        //Q3. Tax
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in Lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.5){
            tax = tax + 0;
        }
        else if(income>2.5f && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income <= 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax paid by the employee is: " + tax);
        

        //Q4. Day of the Week
        Scanner sc2 = new Scanner(System.in);
        int day = sc2.nextInt();

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        //Q5. Leap Year
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc3.nextInt();
        if (year % 4 == 0 ){
            System.out.println("Yes, a leap year ");
        }
        else {
            System.out.println("Not a leap year");
             }


        //Q6. Type of website
        Scanner sc4 = new Scanner(System.in);
        String website = sc4.next();
        if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a Commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }
   




    }
}








    
