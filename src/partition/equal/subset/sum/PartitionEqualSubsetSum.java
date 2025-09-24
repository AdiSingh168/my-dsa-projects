package partition.equal.subset.sum;

import java.util.Arrays;

class PartitionEqualSubsetSum {

    boolean solution(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 == 1) {
            return false;
        }
        int partialSum = sum / 2;
        int n = nums.length;
        boolean[] prev = new boolean[partialSum + 1];
        prev[0] = true;
        if (partialSum >= nums[0]) {
            prev[nums[0]] = true;
        }
        for (int i = 1; i < n; i++) {
            boolean[] curr = new boolean[partialSum + 1];
            for (int j = 1; j <= partialSum; j++) {
                boolean notTake = prev[j], take = false;
                if (j >= nums[i]) {
                    take = prev[j - nums[i]];
                }
                curr[j] = take | notTake;
            }
            curr[0] = true;
            prev = curr;
        }
        return prev[partialSum];
    }

}
