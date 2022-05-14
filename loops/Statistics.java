/** 9) Read numbers until the user enters 0 (sentinel). Show how many
 *  numbers were entered, their sum, average, largest and smallest. */

// imports
import java.util.Scanner;

public class Statistics {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        double number = 0;
        double sum = 0;
        double largest = 0;
        double smallest = 0;
        int count = 0;

        // data entry
        System.out.print("Enter a number (0 to finish): ");
        number = in.nextDouble();

        while (number != 0) {
            if (count == 0) {
                largest = number;
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
            sum += number;
            count++;

            System.out.print("Enter a number (0 to finish): ");
            number = in.nextDouble();
        }

        // show results
        if (count == 0) {
            System.out.println("No numbers were entered");
        } else {
            System.out.println("Count: " + count);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + (sum / count));
            System.out.println("Largest: " + largest);
            System.out.println("Smallest: " + smallest);
        }
    }
}
