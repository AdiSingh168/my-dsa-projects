package minimum.falling.path.sum;

public class MinimumFallingPathSumMain {

    public static void main(String[] args) {
        int[][] matrix = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};

        MinimumFallingPathSum solution = new MinimumFallingPathSum();
        System.out.println(solution.solution(matrix));
    }

}
