
// 1.
class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

// 2.
class cellphone{
    void ringing(){
        System.out.println("Your Cellphone is Ringing");
    }
    void vibrating(){
        System.out.println("Your Cellphone is Vibrating");
    }
}

// 3.
class square{
    int side;
    int area;
    int perimeter;
    public int calcArea(){
        area = side*side;
        return area;
    }
    public int calcPerimeter(){
        perimeter = 4*side;
        return perimeter;
    }
}

// 4.
class rectangle{
    int length;
    int breadth;
    int area;
    int perimeter;
    public int calcArea(){
        area = length*breadth;
        return area;
    }
    public int calcPerimeter(){
        perimeter = 2*(length+breadth);
        return perimeter;
    }
}

// 5.
class tommyVecetti{
    void hit(){
        System.out.println("Hitting!");
    }
    void run(){
        System.out.println("Runing!");
    }
    void fire(){
        System.out.println("Fireing!");
    }
}

// 6.
class circle{
    int radius;
    int area;
    int circumference;
    public int calcArea(){
        area = (22/7)*radius*radius;
        return area;
    }
    public int calcCircumference(){
        circumference = 2*(22/7)*radius;
        return circumference;
    }
}


public class PS8 {
    public static void main(String[] args) {
        Employee1 yasha = new Employee1();
        yasha.salary = 500000000;
        yasha.name = "Yasha";
        System.out.println(yasha.getSalary());
        System.out.println(yasha.getName());
        yasha.setName("Harry");
        System.out.println(yasha.getName());


        cellphone nokia = new cellphone();
        nokia.ringing();
        nokia.vibrating();


        square s1 = new square();
        s1.side=5;
        System.out.println("The Area of the Square is "+s1.calcArea());
        System.out.println("The Perimeter of the Square is "+s1.calcPerimeter());


        rectangle r = new rectangle();
        r.length = 5;
        r.breadth = 2;
        System.out.println("The Area of the Rectangle is "+r.calcArea());
        System.out.println("The Perimeter of the Rectangle is "+r.calcPerimeter());


        tommyVecetti rockstarGames = new tommyVecetti();
        rockstarGames.fire();
        rockstarGames.hit();
        rockstarGames.run();


        circle c = new circle();
        c.radius = 7;
        System.out.println("The Area of the Circle is "+c.calcArea());
        System.out.println("The Circumference of the Circle is "+c.calcCircumference());




    }
}