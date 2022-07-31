/** 5) Insertion sort: take each element and insert it in its place
 *  inside the already sorted part, like sorting cards in your hand. */

public class InsertionSort {

    public static void main(String[] args) {
        // variables
        int[] numbers = {12, 11, 13, 5, 6, 2, 9};

        // sort
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }

        // show results
        System.out.print("Sorted: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
