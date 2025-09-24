package flood.fill;

public class FloodFillMain {

    public static void main(String[] args) {
        int[][] image = {{0, 0, 0}, {1, 0, 0}};
        int sr = 1, sc = 0, color = 2;

        FloodFill solution = new FloodFill();
        int[][] output = solution.solution(image, sr, sc, color);
        System.out.println("Done");
    }

}
