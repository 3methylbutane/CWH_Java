/*
 * Create interface TVRemote and use it to inherit another interface SmartTVRemote
 * Create class TV which implements TVRemote.
 */

interface TVRemote{
    void switchOn();
    void switchOff();
    void incVol();
    void decVol();
}
interface SmartTVRemote extends TVRemote{
    void openNetflix();
    void openYT();
    void openHotstar();
}

class TV implements TVRemote{
    @Override
    public void switchOn(){
        System.out.println("Switching on TV");
    }

    @Override
    public void switchOff() {
        System.out.println("Switching off TV");
    }

    @Override
    public void incVol() {
        System.out.println("increasing volume");
    }

    @Override
    public void decVol() {
        System.out.println("decreasing volume");
    }
}

public class CWH_60_5 {
    public static void main(String[] args) {
        TVRemote tvr = new TV();
        tvr.switchOn();
        tvr.switchOff();
    }
}
