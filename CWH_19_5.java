//WAP to find given year is leap or not

import java.util.Scanner;

public class CWH_19_5 {
    public static void main(String[] args) {
        System.out.print("Enter year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year%4==0 && (year%100!=0)) || (year%400==0)) {
            System.out.println("Yes given year is a leap year");
        }
        else
        System.out.println("Not a leap year");
    }
}
