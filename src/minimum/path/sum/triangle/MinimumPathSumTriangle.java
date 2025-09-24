package minimum.path.sum.triangle;

import java.util.List;

class MinimumPathSumTriangle {

    int solution(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] next = new int[n];
        for (int i = 0; i < n; i++) {
            next[i] = Integer.MIN_VALUE;
        }
        for (int i = 0; i < n; i++) {
            next[i] = triangle.get(n - 1).get(i);
        }
        for (int i = n - 2; i >= 0; i--) {
            int[] curr = new int[i + 1];
            for (int j = i; j >= 0; j--) {
                curr[j] = triangle.get(i).get(j) + Integer.min(next[j], next[j + 1]);
            }
            next = curr;
        }
        return next[0];
    }

}
