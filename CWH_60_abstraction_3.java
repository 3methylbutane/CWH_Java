/*
 * Create a class Monkey with jump() and bite() methods.
 * Create a class Human which inherits this Monkey Class, and
 * implements a BasicAnimal interface with eat() and sleep() methods 
 */

class Monkey {
    void jump() {
        System.out.println("Jumping");
    }
    void bite() {
        System.out.println("Biting");
    }
}

interface BasicAnimal {
    public void eat();
    public void sleep();
}

class Human extends Monkey implements BasicAnimal{
    void speak() {
        System.out.println("Speaking!");
    }
    @Override
    public void eat() {
        System.out.println("Eating");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping!");
    }
}

public class CWH_60_abstraction_3 {
    public static void main(String[] args) {
        Human hm = new Human();
        hm.sleep();
        hm.speak();
        hm.eat();

        Monkey mm = new Human(); //demonstrating polymorphism
        mm.bite();
        mm.jump();
    }
}
