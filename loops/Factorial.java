/** 1) Read a number N and calculate its factorial (N!). */

// imports
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int n = 0;
        long factorial = 1;

        // data entry
        System.out.print("Enter a non-negative number: ");
        n = in.nextInt();

        // calculate factorial
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        // show results
        System.out.println(n + "! = " + factorial);
    }
}
