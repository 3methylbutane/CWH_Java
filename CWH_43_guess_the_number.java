import java.util.Random;
import java.util.Scanner;

class Game{
    int compNumber;
    int userNumber;
    int guesses=0;

    Game() { //here game is a constructor, where everytime we will generate a random number
        Random rand = new Random();
        this.compNumber = rand.nextInt(100);
    }

    void takingUserInput() {
        System.out.print("Enter number : ");
        Scanner sc= new Scanner(System.in);
        userNumber = sc.nextInt();
    }
    boolean checkNumber() {
        guesses++;
        if(userNumber==compNumber) {
            System.out.println("Yes correct, the number is " + userNumber);
            System.out.println("You took " + guesses + " attempts");
            return true;
        }
        else if (userNumber>compNumber) {
            System.out.println("Too High, reduce number");
        }
        else if (userNumber<compNumber) {
            System.out.println("Too Low, increase number");
        }
        return false;
    }
}

public class CWH_43_guess_the_number {
    public static void main(String[] args) {
        Game newGame = new Game();
        boolean loop=false;
        while(!loop) {
            newGame.takingUserInput();
            loop = newGame.checkNumber();
        }
    }
}
