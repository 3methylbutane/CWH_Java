/*
 * Inheritance is used to borrow properties and methods from an existing class
 * Inheritance in Java is declared by using extends keyword
 */
class Base {
    int x;

    public int getX() {
        System.out.print("I am printing X now : ");
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base and setting X now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
    
}

class Derived extends Base {
    int y;

    public int getY() {
        System.out.print("I am printing Y now : ");
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in Derived class and setting Y now");
        this.y = y;
    }

}

public class CWH_45_Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        //We can also use Derived class here
        b.setX(10);
        System.out.println(b.getX());

        //Derived class
        Derived d = new Derived();
        d.setY(14);
        System.out.println(d.getY());
    }    
}
