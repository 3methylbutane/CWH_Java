
interface Bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class Hercules implements Bicycle{
    void blowHorn(){
        System.out.println("Honking");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake of : " + decrement);
    }
    public void speedUp(int increment){
        System.out.println("Speeding Up by : " + increment);
    }
}

public class CWH_54_interfaces {
    public static void main(String[] args) {
        Hercules hr = new Hercules();
        hr.applyBrake(5);
        hr.speedUp(10);
        hr.blowHorn();
    }
}
