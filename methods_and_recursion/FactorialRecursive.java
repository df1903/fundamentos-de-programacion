/** 2) Factorial using recursion. */

// imports
import java.util.Scanner;

public class FactorialRecursive {

    public static long factorial(int n) {
        if (n <= 1) {
            return 1; // base case
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int n = 0;

        // data entry
        System.out.print("Enter a non-negative number: ");
        n = in.nextInt();

        // show results
        System.out.println(n + "! = " + factorial(n));
    }
}
