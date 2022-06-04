/** 5) Merge two sorted arrays into one sorted array. */

public class MergeArrays {

    public static void main(String[] args) {
        // variables
        int[] first = {1, 4, 7, 10, 15};
        int[] second = {2, 3, 8, 9, 20, 25};
        int[] merged = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        // merge
        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                merged[k++] = first[i++];
            } else {
                merged[k++] = second[j++];
            }
        }
        while (i < first.length) {
            merged[k++] = first[i++];
        }
        while (j < second.length) {
            merged[k++] = second[j++];
        }

        // show results
        System.out.print("Merged: ");
        for (int number : merged) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
