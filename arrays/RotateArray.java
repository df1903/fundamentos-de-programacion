/** 6) Rotate the elements of an array K positions to the right.
 *  [1, 2, 3, 4, 5] with K = 2 -> [4, 5, 1, 2, 3] */

// imports
import java.util.Scanner;

public class RotateArray {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5};
        int[] rotated = new int[numbers.length];
        int k = 0;

        // data entry
        System.out.print("Rotate how many positions? ");
        k = in.nextInt();

        // rotate
        for (int i = 0; i < numbers.length; i++) {
            rotated[(i + k) % numbers.length] = numbers[i];
        }

        // show results
        System.out.print("Rotated: ");
        for (int number : rotated) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
