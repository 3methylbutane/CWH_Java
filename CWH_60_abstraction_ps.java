abstract class Pen{
    abstract void write();
    abstract void refill();
    /*
     * abstract classes don't have any implementation
     */
}

class FountainPen extends Pen{
    void write(){
        System.out.println("Writing!");
    }
    void refill(){
        System.out.println("Refilling!");
    }
    void changeNib(){
        System.out.println("Changing Nib!");
    }
}

public class CWH_60_abstraction_ps {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.changeNib();
    } 
}
