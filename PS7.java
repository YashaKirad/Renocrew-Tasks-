
public class PS7 {
    //Q1. 
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }
    // Q2.
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
     //Q3.
    static int sumRec(int n) {
        // Base condition
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }

    //Q4
    static void pattern2(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }  
    //Q5.
    static int fib(int n) {
         if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        } 
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    //Q6.
    static float avg(float...arr) {
        float sum=0;
        float avg=0;
        for(float e:arr) {
            sum+=e;
        }
        avg=sum/arr.length ;
        return avg;
    }
    //Q7.
    static void pattern_recur(int rows) {
        if(rows > 0) {
            for(int i=rows; i>0; i--) {
                System.out.print("*");
            }
            System.out.println();
            pattern_recur(rows-1);
        }
    }
    //Q8
    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Q9.
    static float conv(float n){
        float temp=(n*1.8f)+32;
        return temp;
}
    //Q 10.
    static int natural1(int x){
        int sum = 0;
        for(int i=0; i<=x; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // P 1
         multiplication(7);

         //P 2
      pattern1(4);
       // P 3
         int c = sumRec(4);
         System.out.println(c);
         //P 4.
         pattern2(4);
        //P 5
         int result = fib(7);
         System.out.println(result);

        //P6
        System.out.println(avg(100,120,30));

        //P7
        int r = 4;
        pattern_recur(r);

        // P8
        pattern1_rec(4);

        //P9
        System.out.println(conv(20f));

        //P10
        System.out.println(natural1(5));

    }
}
