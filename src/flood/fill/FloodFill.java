package flood.fill;

import java.util.Map;
import java.util.LinkedList;
import java.util.Queue;

class FloodFill {

    void dfs(int[][] image, boolean[][] visited, int startingPixelColor, int color, Queue<Map.Entry<Integer, Integer>> q) {
        Map.Entry<Integer, Integer> entry = q.poll();
        int row = entry.getKey();
        int col = entry.getValue();

        for (int i = -1; i < 2; i += 2) {
            int updatedValue = row + i;
            if ((updatedValue >= 0) && (updatedValue < image.length) && !visited[updatedValue][col] && (startingPixelColor == image[updatedValue][col])) {
                q.offer(Map.entry(updatedValue, col));
                visited[updatedValue][col] = true;
                image[updatedValue][col] = color;
                dfs(image, visited, startingPixelColor, color, q);
            }

            updatedValue = col + i;
            if ((updatedValue >= 0) && (updatedValue < image[0].length) && !visited[row][updatedValue] && (startingPixelColor == image[row][updatedValue])) {
                q.offer(Map.entry(row, updatedValue));
                visited[row][updatedValue] = true;
                image[row][updatedValue] = color;
                dfs(image, visited, startingPixelColor, color, q);
            }
        }

    }

    int[][] solution(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;

        boolean[][] visited = new boolean[m][n];

        int startingPixelColor = image[sr][sc];

        Queue<Map.Entry<Integer, Integer>> q = new LinkedList<>();
        q.offer(Map.entry(sr, sc));
        visited[sr][sc] = true;
        image[sr][sc] = color;
        dfs(image, visited, startingPixelColor, color, q);

        return image;
    }

}
