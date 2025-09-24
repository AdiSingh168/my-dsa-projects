package minimum.falling.path.sum;

import java.util.Arrays;

class MinimumFallingPathSum {

    int solution(int[][] matrix) {
        int n = matrix.length;
        int[] prev = new int[n];
        for (int i = 0; i < n; i++) {
            prev[i] = matrix[0][i];
        }

        for (int i = 1; i < n; i++) {
            int[] curr = new int[n];
            for (int j = 0; j < n; j++) {
                int ld = 101, rd = 101, down = prev[j];
                if (j != n - 1) {
                    ld = prev[j + 1];
                }
                if (j != 0) {
                    rd = prev[j - 1];
                }
                curr[j] = matrix[i][j] + Integer.min(ld, Integer.min(rd, down));
            }
            prev = curr;
        }

        return Arrays.stream(prev).min().getAsInt();
    }

}
