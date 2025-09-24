package maximum.average.of.any.contiguous.subarray.of.size.k;

class MaximumAverageOfAnyContiguousSubarrayOfSizeK {

    double solution(int[] input, int window) {
        if (input == null) {
            return Integer.MIN_VALUE;
        }
        int maxSum = 0;
        for (int i = 0; i < window && i < input.length; i++) {
            maxSum += input[i];
        }
        int currSum = maxSum;
        for (int i = window; i < input.length; i++) {
            currSum = currSum - input[i - window] + input[i];
            maxSum = Integer.max(maxSum, currSum);
        }

        return (double) maxSum / Integer.min(window, input.length);

    }

}
