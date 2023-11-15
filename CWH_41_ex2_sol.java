import java.util.Random;
import java.util.Scanner;

public class CWH_41_ex2_sol {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor

        System.out.println("0 for Rock, 1 for Paper, 2 for Scissor");
        System.out.println("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        int userNum = sc.nextInt();
        if(userNum > 2) {
            System.out.println("Please enter 0, 1 or 2");
        }
        else {
            Random rn = new Random();
        int compNum = rn.nextInt(3);

        if(userNum==compNum) {
            System.out.println("Its a Draw");
        }
        else if((userNum == 0 && compNum == 2) || (userNum == 1 && compNum == 0) ||
        (userNum == 2 && compNum == 1)) {
            System.out.println("You win");
        }
        else {
            System.out.println("You Lose");
        }
        System.out.println("Computer chose : "+ compNum);
    }
        }
}
