package spiral.matrix;

public class SpiralMatrixMain {

    public static void main(String[] args) {
        int[][] matrix = {{1}, {4}};

        SpiralMatrix solution = new SpiralMatrix();
        System.out.println(solution.solution(matrix));
    }

}
