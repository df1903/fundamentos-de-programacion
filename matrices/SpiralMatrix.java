/** 5) Fill an N x N matrix with the numbers 1 to N*N in a spiral.
 *  N = 3 ->  1 2 3
 *            8 9 4
 *            7 6 5  */

// imports
import java.util.Scanner;

public class SpiralMatrix {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int n = 0;
        int top = 0;
        int bottom = 0;
        int left = 0;
        int right = 0;
        int value = 1;

        // data entry
        System.out.print("Enter the size N: ");
        n = in.nextInt();
        int[][] matrix = new int[n][n];
        bottom = n - 1;
        right = n - 1;

        // fill in spiral
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                matrix[top][j] = value++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;
            for (int j = right; j >= left && top <= bottom; j--) {
                matrix[bottom][j] = value++;
            }
            bottom--;
            for (int i = bottom; i >= top && left <= right; i--) {
                matrix[i][left] = value++;
            }
            left++;
        }

        // show results
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
