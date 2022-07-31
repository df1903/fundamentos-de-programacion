/** 4) Selection sort: find the smallest element of the unsorted part
 *  and place it at the beginning. */

public class SelectionSort {

    public static void main(String[] args) {
        // variables
        int[] numbers = {64, 25, 12, 22, 11, 90, 5};

        // sort
        for (int i = 0; i < numbers.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min]) {
                    min = j;
                }
            }
            int temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;
        }

        // show results
        System.out.print("Sorted: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
