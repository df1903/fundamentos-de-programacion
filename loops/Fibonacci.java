/** 2) Show the first N numbers of the Fibonacci sequence.
 *  If N = 6 -> 0 1 1 2 3 5 */

// imports
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int n = 0;
        long previous = 0;
        long current = 1;
        long next = 0;

        // data entry
        System.out.print("How many terms do you want to see? ");
        n = in.nextInt();

        // show sequence
        for (int i = 0; i < n; i++) {
            System.out.print(previous + " ");
            next = previous + current;
            previous = current;
            current = next;
        }
        System.out.println();
    }
}
