/** 1) Read N numbers into an array and show the sum, average,
 *  largest and smallest values. */

// imports
import java.util.Scanner;

public class ArrayStatistics {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int n = 0;
        double sum = 0;

        // data entry
        System.out.print("How many numbers? ");
        n = in.nextInt();
        double[] numbers = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = in.nextDouble();
        }

        double largest = numbers[0];
        double smallest = numbers[0];

        // calculate
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        // show results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / n));
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
