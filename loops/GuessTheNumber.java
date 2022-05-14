/** 8) Guess the number game. The program picks a number from 1 to 100
 *  and gives hints until the user finds it. */

// imports
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int secret = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        // game
        do {
            System.out.print("Guess the number (1-100): ");
            guess = in.nextInt();
            attempts++;

            if (guess < secret) {
                System.out.println("Too low");
            } else if (guess > secret) {
                System.out.println("Too high");
            }
        } while (guess != secret);

        // show results
        System.out.println("Correct! You needed " + attempts + " attempts");
    }
}
