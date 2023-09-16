//WAP to print day given number
//1->Mo, 2->Tu, 3->We, 4->Th, 5->Fr, 6-> Sa, 7-> Su

import java.util.Scanner;

public class CWH_19_4 {
    public static void main(String[] args) {
        System.out.println("Enter number to find respective day");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}
