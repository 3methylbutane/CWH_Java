//recursive function to calculate sum of first n natural numbers 

import java.util.Scanner;
public class CWH_35_3 {
    static int sum(int x) {
        int res = 0;
        if(x==1) {
            res+=x;
        }
        else {
            res += x + sum(x-1);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(sum(x));

    }
}
