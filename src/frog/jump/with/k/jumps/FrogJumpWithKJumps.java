package frog.jump.with.k.jumps;

import java.util.Arrays;

class FrogJumpWithKJumps {

    int solve(int[] heights, int[] dp, int n, int k) {
        if (n == 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int[] prev = new int[n];
        Arrays.fill(prev, Integer.MAX_VALUE);
        for (int i = 1; i <= k && i <= n; i++) {
            prev[i - 1] = solve(heights, dp, n - i, k) + Math.abs(heights[n] - heights[n - i]);
        }

        dp[n] = Arrays.stream(prev).min().getAsInt();
        return dp[n];
    }

    int solution(int[] heights, int k) {
        int n = heights.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        return solve(heights, dp, n - 1, k);
    }

}
