package spiral.matrix;

import java.util.*;

class SpiralMatrix {

    List<Integer> solution(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        List<Integer> output = new LinkedList<>();
        while (top <= bottom && left <= right) {

            // top row.... left -> right
            for (int j = left; j <= right; j++) {
                output.add(matrix[top][j]);
            }
            top++;

            // right-most column.... top -> bottom
            for (int i = top; i <= bottom; i++) {
                output.add(matrix[i][right]);
            }
            right--;

            // bottom row.... right -> left
            for (int j = right; j >= left && top <= bottom; j--) {
                output.add(matrix[bottom][j]);
            }
            bottom--;

            // left-most column.... bottom -> top
            for (int i = bottom; i >= top && left <= right; i--) {
                output.add(matrix[i][left]);
            }
            left++;

        }
        return output;
    }

}
