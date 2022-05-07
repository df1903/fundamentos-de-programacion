/** 4) Read a number and tell whether it is prime. */

// imports
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int number = 0;
        boolean prime = true;

        // data entry
        System.out.print("Enter a whole number: ");
        number = in.nextInt();

        if (number < 2) {
            prime = false;
        }

        // look for a divisor up to the square root
        for (int i = 2; i * i <= number && prime; i++) {
            if (number % i == 0) {
                prime = false;
            }
        }

        // show results
        if (prime) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }
    }
}
