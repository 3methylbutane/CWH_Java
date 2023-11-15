/*
 * abstract class is a class which have abstract methods
 * an abstract method is a method that is declared without any implementation
 * abstract classes cannot be instantiated
 */

abstract class Parent {
    public Parent() {
        System.out.println("Constructor of Parent");
    }
    public void sayHello() {
        System.out.println("Hello!");
    }
    abstract public void greet();

}

class Child extends Parent{
    public void greet() {
        System.out.println("Greeting");
    }
}

abstract class Child2 extends Parent{
    public void th(){
        System.out.println("I am here!");
    }
}

public class CWH_53_abstract_class {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.sayHello();
        ch.greet();
    }
}
