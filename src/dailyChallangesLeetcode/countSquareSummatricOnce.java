//=> it's the problem of DP i've not studied yet so i pasted it from  to maintain streak;
package dailyChallangesLeetcode;

public class countSquareSummatricOnce {
    public static int countSqrareSummWithOnce(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] prev = new int[cols];
        int[] curr = new int[cols];

        int totalSquares = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        curr[j] = 1;  // First row or column
                    } else {
                        curr[j] = 1 + Math.min(
                                Math.min(prev[j], curr[j - 1]),
                                prev[j - 1]
                        );
                    }
                    totalSquares += curr[j];
                } else {
                    curr[j] = 0;
                }
            }
            // Move curr row to prev row for next iteration
            int[] temp = prev;
            prev = curr;
            curr = temp; // Reuse arrays
        }
        return totalSquares;
    }
    public static void main(String[] args){
        int[][] matrix = {
                {0 , 1 , 1 , 1},
                {1 , 1 , 1 , 1},
                {0 , 1 , 1 , 1}
        };
        System.out.println(countSqrareSummWithOnce(matrix));
    }
}
