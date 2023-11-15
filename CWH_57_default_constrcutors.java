interface Camera{
    public void takePhoto();
    public void takeVideo();
    private void greet(){
        System.out.println("Good Morning!");
    }
    /*
     * If we want to update a constructor, then it will be difficult to do, as we have to
     * change in every class who implements it. therefore default constructors were 
     * introduced in Java 8 for backward compatibility
     * We use private methods in interfaces, so to split up the logic if it is big
     * cannot implement private methods in classes
     */
    default void take4KVideo(){
        greet();
        System.out.println("Taking 4K Video");
    }
}

interface Wifi{
    String[] listNetworks();
    void connectToNetwork();

}

class CellPhone{
    void call(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Hello?!");
    }
}

class SmartPhone extends CellPhone implements Wifi, Camera {
    @Override
    public void takePhoto() {
        System.out.println("Taking Photo");
    }

    @Override
    public void takeVideo() {
        System.out.println("Taking Video");
    }

    @Override
    public String[] listNetworks(){
        System.out.println("Listing Networks");
        String[] list = {"Wifi1","Wifi2", "Wifi3"};
        return list;
    }

    @Override
    public void connectToNetwork() {
        System.out.println("Connecting to Network");
    }
    
}

public class CWH_57_default_constrcutors {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.call(343283948);
        sp.pickCall();
        sp.takePhoto();
        sp.takeVideo();
        String[] wifis = sp.listNetworks();
        for (String itr : wifis) {
            System.out.println(itr);
        }
        sp.connectToNetwork();
        sp.take4KVideo();
    }
}
