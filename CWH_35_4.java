//use recursion to print
// * * * *
// * * * 
// * * 
// * 

//Normal
// import java.util.Scanner;

// public class CWH_35_4 {
//     static void pattern (int n) {
//         for(int i=n;i>0;i--) {
//             for(int j=i;j>0;j--){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
       
//     }
//     public static void main(String[] args) {
//         System.out.print("Enter length : ");
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         pattern(x);
//     }
// }

//recursion

import java.util.Scanner;

public class CWH_35_4 {
    static void pattern(int n) {
        if(n>0) {
            for(int i=n;i>0;i--){
                System.out.print("* ");
            }
            System.out.println();
            pattern(n-1);
        } 
    }
    public static void main(String[] args) {
        System.out.print("Enter length : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        pattern(x);
    }
}