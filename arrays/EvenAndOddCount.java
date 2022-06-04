/** 3) Fill an array with N random numbers between 1 and 100 and
 *  count how many are even and how many are odd. */

// imports
import java.util.Random;
import java.util.Scanner;

public class EvenAndOddCount {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int n = 0;
        int even = 0;
        int odd = 0;

        // data entry
        System.out.print("Array size: ");
        n = in.nextInt();
        int[] numbers = new int[n];

        // fill and count
        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(100) + 1;
            System.out.print(numbers[i] + " ");
            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // show results
        System.out.println();
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
