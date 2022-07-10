/** 5) Add the digits of a number using recursion.
 *  1234 -> 10 */

// imports
import java.util.Scanner;

public class SumOfDigitsRecursive {

    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int n = 0;

        // data entry
        System.out.print("Enter a positive number: ");
        n = in.nextInt();

        // show results
        System.out.println("Sum of digits: " + sumDigits(n));
    }
}
