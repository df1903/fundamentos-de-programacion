/** 4) Calculate base^exponent with recursion (non-negative exponent). */

// imports
import java.util.Scanner;

public class PowerRecursive {

    public static long power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int base = 0;
        int exponent = 0;

        // data entry
        System.out.print("Enter the base: ");
        base = in.nextInt();
        System.out.print("Enter the exponent: ");
        exponent = in.nextInt();

        // show results
        System.out.println(base + "^" + exponent + " = " + power(base, exponent));
    }
}
