package folder.folderl1.folderl2;
class Calculator{
    public void calculate(int a,int b){
        System.out.println("Result:"+ a+b);

    }
}
class ScCalculator{
    public void calculate(int a,int b){
        System.out.println("Result:"+ Math.sin(a+b));

    }
}
class HyCalculator{
    public void calculate(int a,int b){
        System.out.println("Result:"+ a+b);
        System.out.println("Result:"+ Math.sin(a+b));

    }
}

public class PS12p3{
    public static void main(String [] args){
        System.out.println("Main Method");
    }
}