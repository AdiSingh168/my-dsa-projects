package house.robber.two;


class HouseRobberTwo {

    int solution(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        int[] temp1 = new int[n - 1], temp2 = new int[n - 1];
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                temp1[i - 1] = nums[i];
            }
            if (i != n - 1) {
                temp2[i] = nums[i];
            }
        }
        return Integer.max(rob(temp1), rob(temp2));
    }

    int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        int prev = nums[0], prev2 = 0, curi = 0;

        for (int i = 1; i < n; i++) {
            int take = nums[i];
            if (i != 1) {
                take += prev2;
            }
            int notTake = prev;
            curi = Integer.max(take, notTake);
            prev2 = prev;
            prev = curi;
        }
        return prev;
    }
}
