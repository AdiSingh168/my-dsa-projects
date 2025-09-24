package rotate.image;

public class RotateImageMain {

    public static void main(String[] args) {
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};

        RotateImage solution = new RotateImage();
        solution.solution(matrix);
        System.out.println("Done");
    }

}
