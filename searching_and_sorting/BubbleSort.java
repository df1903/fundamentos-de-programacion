/** 3) Bubble sort: compare neighbors and swap them if they are in the
 *  wrong order. Repeat until no swaps are needed. */

public class BubbleSort {

    public static void main(String[] args) {
        // variables
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        boolean swapped = true;

        // sort
        for (int pass = 0; pass < numbers.length - 1 && swapped; pass++) {
            swapped = false;
            for (int i = 0; i < numbers.length - 1 - pass; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swapped = true;
                }
            }
        }

        // show results
        System.out.print("Sorted: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
