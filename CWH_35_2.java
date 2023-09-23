// *
// * *
// * * * 
// * * * * 

import java.util.Scanner;
public class CWH_35_2 {
    static void pattern(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter length : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
        
    }
}
