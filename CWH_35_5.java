//fibonacci

import java.util.Scanner;

public class CWH_35_5 {
    static int fib(int n) {
        if(n==0 || n==1) {
            return n;
        }
        else {
            return fib(n-1)+ fib(n-2);
        }

    }
    public static void main(String[] args) {
        System.out.print("Enter the index : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(fib(x));
    }
}

// 0 1 2 3 4 5 6 7
// | | | | | | | |
// 0 1 1 2 3 5 8 13