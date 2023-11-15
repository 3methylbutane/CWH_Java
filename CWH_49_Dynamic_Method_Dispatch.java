class Phone {
    public void call() {
        System.out.println("Calling Normally");
    }
    public void message() {
        System.out.println("Messaging Normally");
    }
    public void radio() {
        System.out.println("Playing Radio");
    }
}

class SmartPhone extends Phone {
    public void call() {
        System.out.println("Calling Smartly");
    }
    public void message() {
        System.out.println("Messaging Smartly");
    }
    public void videocall() {
        System.out.println("Video Calling");
    }
}

public class CWH_49_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        // Phone ph = new Phone();
        // ph.call();
        // ph.message();
        // SmartPhone smph = new SmartPhone();
        // smph.call();
        // smph.message();

        Phone ph = new SmartPhone(); //allowed
        //SmartPhone smph = new Phone(); //not allowed
        ph.call();
        ph.message();
        //ph.videocall(); //not available as SmartPhone can only run methods referencing from Phone
        ph.radio();

        /*
         * in 1st case a smartphone object can be of type Phone
         * (Phone is reference for object SmartPhone)
         * (can only call methods mentioned in superclass)
         * in 2nd case a phone object is not of type SmartPhone
         * every SmartPhone is a Phone, but not every Phone is SmartPhone
         * methods of objects will run
         */

    }
}
