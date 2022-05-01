/** 5) Read a number, count its digits and add them.
 *  If the number is 1234 -> 4 digits, sum 10 */

// imports
import java.util.Scanner;

public class DigitSum {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int number = 0;
        int digits = 0;
        int sum = 0;

        // data entry
        System.out.print("Enter a positive whole number: ");
        number = in.nextInt();

        // separate the digits
        while (number > 0) {
            sum += number % 10;
            number /= 10;
            digits++;
        }

        // show results
        System.out.println("Digits: " + digits);
        System.out.println("Sum of digits: " + sum);
    }
}
