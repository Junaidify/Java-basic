public class IterateColumsthenRow {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 }
        };

        for (int i = mat[0].length - 1; i >= 0; i--) { // this code is , when we have to iterate colums first and then
                                                       // rows
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[j][i] + " ");
            }
        }
    }
}
