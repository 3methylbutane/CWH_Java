//WAP to calc income tax
// 0 to 2.5 --- 0%
// 2.5 to 5 --- 5%
// 5 to 10  --- 20%
// > 10     --- 30% 

import java.util.Scanner;

public class CWH_19_3 {
    public static void main(String[] args) {
        System.out.println("Enter your income in LPA");
        Scanner sc = new Scanner(System.in);
        float income,tax=0;
        income = sc.nextFloat();
        if(income < 2.5)
        tax = 0;
        else if (income >= 2.5 && income <5) {
            tax += (income - 2.5f )*0.05f;

        }
        else if(income >= 5 && income <10) {
            tax += (2.5f * 0.05f);
            tax += (income - 5f)*0.2f;
        }
        else {
            tax += (2.5f * 0.05f);
            tax += (5f * 0.2f);
            tax += (income - 10f)*0.3f;
        }
        System.out.println("Tax to be paid: " + tax*100000);
    }
}