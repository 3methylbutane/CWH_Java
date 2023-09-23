import java.util.Scanner;

public class CWH_35_1 {
    static void multiplication(int n) {
        for(int i=1;i<=100;i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        multiplication(x);
    }
}
