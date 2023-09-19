//WAP to sum first n even numbers

import java.util.Scanner;

public class CWH_25_2 {
    public static void main(String[] args) {
        System.out.print("Enter value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i+=2)
        sum+=i;
        System.out.println(sum);
    }
}
