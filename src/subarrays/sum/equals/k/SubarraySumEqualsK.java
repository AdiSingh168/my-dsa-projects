package subarrays.sum.equals.k;

class SubarraySumEqualsK {

    boolean solve(int n, int k, int[] arr) {
        boolean[] prev = new boolean[k + 1];
        prev[0] = true;
        if (arr[0] < k) {
            prev[arr[0]] = true;
        }
        for (int i = 1; i < n; i++) {
            boolean[] curr = new boolean[k + 1];
            for (int j = 1; j < k + 1; j++) {
                boolean taken = false, notTaken = false;
                if (arr[i] <= j) {
                    taken = prev[j - arr[i]];
                }
                if (!taken) {
                    notTaken = prev[j];
                }
                curr[j] = taken | notTaken;
            }
            curr[0] = true;
            prev = curr;
        }
        return prev[k];
    }
}
