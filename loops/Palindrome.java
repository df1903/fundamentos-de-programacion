/** 6) Read a whole number and tell whether it is a palindrome
 *  (reads the same backwards). Ex: 12321 */

// imports
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int number = 0;
        int copy = 0;
        int reversed = 0;

        // data entry
        System.out.print("Enter a positive whole number: ");
        number = in.nextInt();
        copy = number;

        // reverse the number
        while (copy > 0) {
            reversed = reversed * 10 + copy % 10;
            copy /= 10;
        }

        // show results
        if (reversed == number) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
}
