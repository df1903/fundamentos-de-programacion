/** 4) Read N numbers and show them without repeated values,
 *  keeping the order of first appearance. */

// imports
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int n = 0;
        int uniqueCount = 0;

        // data entry
        System.out.print("How many numbers? ");
        n = in.nextInt();
        int[] numbers = new int[n];
        int[] unique = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = in.nextInt();
        }

        // keep only the first appearance
        for (int i = 0; i < n; i++) {
            boolean repeated = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j] == numbers[i]) {
                    repeated = true;
                }
            }
            if (!repeated) {
                unique[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }

        // show results
        System.out.print("Without duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }
        System.out.println();
    }
}
