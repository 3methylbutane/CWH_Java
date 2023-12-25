import java.util.Scanner;

public class CWH_86_ps {
    public static void main(String[] args) {
        // int [] arr = new int[]{0,1,2,3};
        // int [] arr = {0,1,2,3};
        // int arr[] = {0,1,2,3};
        // int arr[] = new int[4];
        int arr[] = {0,1,2,3};
        Scanner sc = new Scanner(System.in);
        int idx;
        boolean flag = true;
        int i=0;
        while(flag && i<5) {
            try {
                System.out.println("Enter index: ");
                idx = sc.nextInt();
                System.out.println("The value at index is : " + arr[idx]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid index");
                i++;
            }

        }
        if(i>=5)
        System.out.println("Error");
    }
    
}
