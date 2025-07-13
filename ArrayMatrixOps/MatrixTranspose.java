public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        for (int[] row : matrix)
            System.out.println(java.util.Arrays.toString(row));

        System.out.println("Transposed Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matrix[j][i] + " ");
            System.out.println();
        }
    }
}
