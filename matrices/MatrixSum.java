/** 1) Read two matrices of size N x M and show their sum. */

// imports
import java.util.Scanner;

public class MatrixSum {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int rows = 0;
        int cols = 0;

        // data entry
        System.out.print("Rows: ");
        rows = in.nextInt();
        System.out.print("Columns: ");
        cols = in.nextInt();
        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];

        System.out.println("First matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("Second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                b[i][j] = in.nextInt();
            }
        }

        // show the sum
        System.out.println("Sum:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print((a[i][j] + b[i][j]) + "\t");
            }
            System.out.println();
        }
    }
}
