/** 6) Merge sort: split the array in halves, sort each half
 *  recursively and merge them. */

public class MergeSort {

    public static void mergeSort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int middle = (left + right) / 2;
        mergeSort(a, left, middle);
        mergeSort(a, middle + 1, right);
        merge(a, left, middle, right);
    }

    public static void merge(int[] a, int left, int middle, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = middle + 1;
        int k = 0;

        while (i <= middle && j <= right) {
            temp[k++] = a[i] <= a[j] ? a[i++] : a[j++];
        }
        while (i <= middle) {
            temp[k++] = a[i++];
        }
        while (j <= right) {
            temp[k++] = a[j++];
        }
        for (k = 0; k < temp.length; k++) {
            a[left + k] = temp[k];
        }
    }

    public static void main(String[] args) {
        // variables
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};

        // sort
        mergeSort(numbers, 0, numbers.length - 1);

        // show results
        System.out.print("Sorted: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
