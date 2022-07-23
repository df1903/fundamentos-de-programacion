/** 6) Check whether a square matrix is a magic square: all rows,
 *  columns and both diagonals add up to the same value. */

public class MagicSquare {

    public static void main(String[] args) {
        // variables
        int[][] matrix = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };
        int n = matrix.length;
        int target = 0;
        boolean magic = true;
        int diagonal = 0;
        int antiDiagonal = 0;

        // target = sum of the first row
        for (int j = 0; j < n; j++) {
            target += matrix[0][j];
        }

        // rows and columns
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (rowSum != target || colSum != target) {
                magic = false;
            }
            diagonal += matrix[i][i];
            antiDiagonal += matrix[i][n - 1 - i];
        }

        if (diagonal != target || antiDiagonal != target) {
            magic = false;
        }

        // show results
        if (magic) {
            System.out.println("It is a magic square (constant " + target + ")");
        } else {
            System.out.println("It is not a magic square");
        }
    }
}
