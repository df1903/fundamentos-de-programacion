/** 7) Calculate the greatest common divisor (GCD) and the least
 *  common multiple (LCM) of two numbers using Euclid's algorithm. */

// imports
import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int x = 0;
        int y = 0;
        int rest = 0;

        // data entry
        System.out.print("Enter the first number: ");
        a = in.nextInt();
        System.out.print("Enter the second number: ");
        b = in.nextInt();
        x = a;
        y = b;

        // euclid
        while (y != 0) {
            rest = x % y;
            x = y;
            y = rest;
        }

        // show results
        System.out.println("GCD: " + x);
        System.out.println("LCM: " + (a / x * b));
    }
}
