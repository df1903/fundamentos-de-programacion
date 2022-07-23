/** 4) Given a square matrix, add the main diagonal and the
 *  secondary diagonal. */

public class MatrixDiagonals {

    public static void main(String[] args) {
        // variables
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = matrix.length;
        int mainDiagonal = 0;
        int secondaryDiagonal = 0;

        // add diagonals
        for (int i = 0; i < n; i++) {
            mainDiagonal += matrix[i][i];
            secondaryDiagonal += matrix[i][n - 1 - i];
        }

        // show results
        System.out.println("Main diagonal: " + mainDiagonal);
        System.out.println("Secondary diagonal: " + secondaryDiagonal);
    }
}
