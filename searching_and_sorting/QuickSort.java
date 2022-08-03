/** 7) Quick sort: choose a pivot, put the smaller values before it and
 *  the bigger ones after it, then repeat on each side. */

public class QuickSort {

    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(a, low, high);
            quickSort(a, low, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        // variables
        int[] numbers = {10, 80, 30, 90, 40, 50, 70};

        // sort
        quickSort(numbers, 0, numbers.length - 1);

        // show results
        System.out.print("Sorted: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
