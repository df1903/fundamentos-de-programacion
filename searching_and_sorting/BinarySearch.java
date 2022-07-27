/** 2) Binary search over a sorted array. Each step discards half of it. */

// imports
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int[] numbers = {3, 7, 15, 19, 42, 61, 88};
        int target = 0;
        int low = 0;
        int high = numbers.length - 1;
        int position = -1;

        // data entry
        System.out.print("Enter the number to look for: ");
        target = in.nextInt();

        // search
        while (low <= high && position == -1) {
            int middle = (low + high) / 2;
            if (numbers[middle] == target) {
                position = middle;
            } else if (numbers[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
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
