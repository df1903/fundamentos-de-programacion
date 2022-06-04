/** 2) Read N numbers and show them in reverse order. */

// imports
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int n = 0;

        // data entry
        System.out.print("How many numbers? ");
        n = in.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = in.nextInt();
        }

        // reverse in place
        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = temp;
        }

        // show results
        System.out.print("Reversed: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
