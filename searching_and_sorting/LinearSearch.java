/** 1) Linear search: find a value in an unsorted array and show its position. */

// imports
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int[] numbers = {42, 7, 19, 3, 88, 15, 61};
        int target = 0;
        int position = -1;

        // data entry
        System.out.print("Enter the number to look for: ");
        target = in.nextInt();

        // search
        for (int i = 0; i < numbers.length && position == -1; i++) {
            if (numbers[i] == target) {
                position = i;
            }
        }

        // show results
        if (position == -1) {
            System.out.println("The number is not in the array");
        } else {
            System.out.println("Found at position " + position);
        }
    }
}
