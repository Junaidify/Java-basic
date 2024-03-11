public class Arr2DSum {
     public static void main(String[] args) {

        // Sample 2D array
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Calculate column sums
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int j = 0; j < cols; j++) {
            int columnSum = 0;

            for (int i = 0; i < rows; i++) {
                columnSum += matrix[i][j];
            }

            System.out.println("Sum of Column " + (j + 1) + ": " + columnSum);
        }
    }
}
