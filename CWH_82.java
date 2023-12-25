import java.util.Scanner;

public class CWH_82 {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while(!flag) {
            System.out.println("Enter index ");
            int idx = sc.nextInt();
            try {
                System.out.println("Welcome to the program");
                try{
                    System.out.println("Value at index is " + arr[idx]);
                    flag = true;
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception on Level 2 occured");
                    System.out.println("Please try again - ");
                }
            }
            catch(Exception e) {
                System.out.println("Exception on Level 1" + e);
            }
        }
        System.out.println("Thank you for using program");

    }
}
