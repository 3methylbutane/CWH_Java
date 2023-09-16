import java.util.Scanner;

//WAP to find student is pass or fail - total 40% combined and 33% in all three subjects
public class CWH_19_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float m1, m2, m3;
        System.out.println("Enter marks in Physics");
        m1 = sc.nextFloat();
        System.out.println("Enter marks in Chemistry");
        m2 = sc.nextFloat();
        System.out.println("Enter marks in Maths");
        m3 = sc.nextFloat();

        float avg = (m1+m2+m3)/3;
        System.out.println("Percentage is : " + avg + "%");
        
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33)
        System.out.println("Pass");
        else
        System.out.println("Fail");
    }
}