import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "I am toString";
    }
    @Override
    public String getMessage(){
        return "I am getMessage";
    }
}

public class CWH_83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        if(a<100) {
            try {
                throw new MyException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Finished try-catch");
        }
        else
        System.out.println(a);
    }
}
