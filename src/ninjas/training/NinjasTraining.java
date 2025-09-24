package ninjas.training;

class NinjasTraining {

    int solution(int[][] points) {
        int n = points.length;
        int[] dp = new int[4];
        dp[0] = Integer.max(points[0][1], points[0][2]);
        dp[1] = Integer.max(points[0][0], points[0][2]);
        dp[2] = Integer.max(points[0][0], points[0][1]);
        dp[3] = Integer.max(Integer.max(points[0][0], points[0][1]), points[0][2]);

        for (int day = 1; day < n; day++) {
            int[] temp = new int[4];
            for (int lastDay = 0; lastDay < 4; lastDay++) {
                temp[lastDay] = 0;
                for (int i = 0; i < 3; i++) {
                    if (i != lastDay) {
                        temp[lastDay] = Integer.max(temp[lastDay], points[day][i] + dp[i]);
                    }
                }
            }
            dp = temp;
        }

        return dp[3];
    }

}
