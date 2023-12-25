import java.util.Scanner;

public class CWH_81 {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index - ");
        int idx = sc.nextInt();

        System.out.println("Enter the value you want to divide with - ");
        int val = sc.nextInt();

        try {
            System.out.println("The value at your index is "+ arr[idx]);
            System.out.println("After divinding it with the value you provided is " + arr[idx]/val);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("ArrayIndexOutOfBoundsException occured, check index of the array");
        }
        catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("ArithmeticException occured, check value provided (should not be 0)");
        }

    }
}
