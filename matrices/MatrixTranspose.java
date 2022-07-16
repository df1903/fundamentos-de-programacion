/** 2) Show the transpose of a matrix (rows become columns). */

public class MatrixTranspose {

    public static void main(String[] args) {
        // variables
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] transpose = new int[matrix[0].length][matrix.length];

        // transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // show results
        System.out.println("Transpose:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
