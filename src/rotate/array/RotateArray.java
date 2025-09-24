package rotate.array;

class RotateArray {

    void solutionWithOnkTimeComplexityAndO1SpaceComplexity(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        if (k == 0) {
            return;
        }

        while (k > 0) {
            int lastElement = nums[n - 1];
            for (int i = n - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = lastElement;
            k--;
        }
    }

    void solutionWithOnTimeComplexityAndOnSpaceComplexity(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        if (k == 0) {
            return;
        }

        int[] output = new int[n];

        for (int i = 0; i < n - k; i++) {
            output[i + k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            output[i] = nums[n - k + i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = output[i];
        }
    }

    void solutionWithOnTimeComplexityAndO1SpaceComplexity(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        if (k == 0) {
            return;
        }

        reverseCertainRangeIndex(nums, 0, n - 1);
        reverseCertainRangeIndex(nums, 0, k - 1);
        reverseCertainRangeIndex(nums, k, n - 1);
    }

    void reverseCertainRangeIndex(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
