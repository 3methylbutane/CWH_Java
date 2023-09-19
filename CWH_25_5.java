//WAP to reverse array

import java.util.Scanner;

public class CWH_25_5 {
    public static void main(String[] args) {
        System.out.println("Enter array length: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            int num = sc.nextInt();
            arr[i]=num;
        }
        System.out.println("Before reverting");
        for(int i=0;i<n;i++)
        System.out.print (arr[i] + " ");
        System.out.println("\nAfter reverting");

        int mid = Math.floorDiv(n,2);
        for(int i=0;i<mid;i++)
        {
            int swap;
            swap = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = swap;
        }
        for(int i=0;i<n;i++)
        System.out.print (arr[i] + " ");
    }
}
