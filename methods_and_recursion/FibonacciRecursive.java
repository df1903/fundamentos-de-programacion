/** 3) Fibonacci using recursion. */

// imports
import java.util.Scanner;

public class FibonacciRecursive {

    public static int fibonacci(int n) {
        if (n < 2) {
            return n; // base cases: fib(0) = 0, fib(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int n = 0;

        // data entry
        System.out.print("How many terms? ");
        n = in.nextInt();

        // show results
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
}
