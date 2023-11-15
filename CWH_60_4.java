/*
 * Create a class Telephone with ring(), lift(), disconnect() as abstract methods.
 * Create a class SmartTelephone which demonstrate polymorphism
 */

abstract class Telephone {
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone {

    @Override
    void ring() {
        System.out.println("Ringing!");
    }

    @Override
    void lift() {
       System.out.println("Lifting!");
    }

    @Override
    void disconnect() {
        System.out.println("Disconnecting!");
    }

    void videoCall() {
        System.out.println("VideoCalling");
    }
    
}
 
public class CWH_60_4 {
    public static void main(String[] args) {
        Telephone tt = new SmartTelephone();
        tt.disconnect();
        tt.lift();
        tt.ring();
        //tt.videoCall(); //cannot implement
    }
}
