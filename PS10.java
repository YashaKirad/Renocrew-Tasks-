  class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non param of circle");
    }
    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
class rectangle1
{
 private float width,breadth;
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }
    float area()
    {
        return width*breadth;
    }
}
class cuboid extends rectangle1
{
    private float height;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    float volume()
    {
        return area()*height;
    }
}
public class PS10 {
    public static void main(String[] args) {
        rectangle1 rec=new rectangle1();

        cuboid obj=new cuboid();
        rec.setWidth(5);
        rec.setBreadth(8);
        obj.setHeight(10);
        obj.setWidth(6);
        obj.setBreadth(3);
        System.out.println("The width of the rectangle is "+rec.getWidth());
        System.out.println("The breadth of the rectangle is "+rec.getBreadth());
        System.out.println("The area of the rectangle is "+rec.area());
        System.out.println("The width of the cuboid is "+obj.getWidth());
        System.out.println("The breadth of the cuboid is "+obj.getBreadth());
        System.out.println("The height of the cuboid is "+obj.getHeight());
        System.out.println("The volume of the cuboid is "+obj.volume());
    }
}

