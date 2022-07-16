/** 3) Multiply two matrices. The columns of the first one must be
 *  equal to the rows of the second one. */

public class MatrixMultiplication {

    public static void main(String[] args) {
        // variables
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] b = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        if (a[0].length != b.length) {
            System.out.println("The matrices cannot be multiplied");
            return;
        }

        int[][] result = new int[a.length][b[0].length];

        // multiply
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // show results
        System.out.println("Product:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
