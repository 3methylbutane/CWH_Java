/*
 * When a derived class is extended form Base class, the constructor of Base class is
 * executed first then constructor of Derived class
 */
class Base {
    Base() {
        System.out.println("In Base Class");
    }
}

class Derived extends Base{
    Derived() {
        System.out.println("In Derived Class");
    }
}
public class CWH_46_ConstcutorsInInheritance {
    public static void main(String[] args) {
        Derived d = new Derived();
    }
}
