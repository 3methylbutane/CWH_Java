public class CWH_80_errorHandling {
    public static void main(String[] args) {
        int a=6000;
        int b=0;
        try {
            int c=a/b;
            System.out.println("Result is : " + c);
        } catch (Exception e) {
            System.out.println("Failed due to : " + e);
        }
        System.out.println("You have reached the end of the program");
    }
}
