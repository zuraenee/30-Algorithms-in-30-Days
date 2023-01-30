import java.util.*;

public class RandomGuess{
    static void maingame() {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the guessing game! insert number between 1 and 100");
        int guessNumber = input.nextInt();
        int randomNumber = rand.nextInt(0, 100);
        System.out.println("Random Number : " + randomNumber + " Guessed Number : " + guessNumber);
        trygame();
    }
    static void trygame(){
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to try again? : ");
        String tryagain = input.nextLine();
        if (tryagain.equals("yes")) {
            maingame();
        } else {
            System.out.println("Thanks for playing!");
        }
    }
    public static void main(String[] args) {
        maingame();
    }

}
