package unique.paths;

class UniquePaths {

    int solution(int m, int n) {
        int[] prev = new int[n];
        for (int i = 0; i < m; i++) {
            int[] temp = new int[n];
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    temp[0] = 1;
                } else {
                    int left = 0;
                    if (j > 0) {
                        left = temp[j - 1];
                    }
                    temp[j] = prev[j] + left;
                }
            }
            prev = temp;
        }

        return prev[n - 1];
    }

}
