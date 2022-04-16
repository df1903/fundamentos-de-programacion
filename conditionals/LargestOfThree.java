/** 1) Read three numbers and show the largest one. */

// imports
import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        double largest = 0;

        // data entry
        System.out.print("Enter the first number: ");
        a = in.nextDouble();
        System.out.print("Enter the second number: ");
        b = in.nextDouble();
        System.out.print("Enter the third number: ");
        c = in.nextDouble();

        // find the largest
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        // show results
        System.out.println("The largest number is: " + largest);
    }
}
