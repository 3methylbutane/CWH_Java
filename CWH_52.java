// Create a class Circle and use Inheritance to create another class Cylinder
// Create methods for Area, Vol

class Circle {
    int radius;

    Circle() {
        System.out.println("I am inside Circle's non-paramertized constructor ");
    }
    Circle(int a) {
        System.out.println("I am inside Circle's paramertized constructor");
        this.radius = a;
        System.out.println("and my radius is " + radius);
        
    }
    double Area() {
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder extends Circle{
    int height;
    Cylinder(int r, int h) {
        super(r);
        this.height = h;
        System.out.println("I am insider Cylinder's paramertized constructor");
        System.out.println("with radius " + radius + " and height " + height);
    }
    double Volume() {
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class CWH_52 {
    public static void main(String[] args) {
        Circle cir1= new Circle(5);
        System.out.println(cir1.Area());
        Cylinder cyn1 = new Cylinder(12, 17);
        System.out.println(cyn1.Volume());
    }
}
