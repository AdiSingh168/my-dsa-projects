package rotate.image;

class RotateImage {

    void solution(int[][] matrix) {
        int n = matrix.length;
        int start = 0, end = n - 1;
        while (start < end) {
            for (int i = 0; i < n; i++) {
                int temp = matrix[start][i];
                matrix[start][i] = matrix[end][i];
                matrix[end][i] = temp;
            }
            start++;
            end--;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

}
