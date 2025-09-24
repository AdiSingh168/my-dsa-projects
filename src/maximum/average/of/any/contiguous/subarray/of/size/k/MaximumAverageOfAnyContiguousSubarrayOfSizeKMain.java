package maximum.average.of.any.contiguous.subarray.of.size.k;

public class MaximumAverageOfAnyContiguousSubarrayOfSizeKMain {

    public static void main(String[] args) {
        // getting input; print input
        int[] input = {5};
        int window = 4;
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
        }
        System.out.println("\nWindow = " + window + "\n");

        // getting maxAvg
        MaximumAverageOfAnyContiguousSubarrayOfSizeK solution = new MaximumAverageOfAnyContiguousSubarrayOfSizeK();
        double maxAvg = solution.solution(input, window);

        //print output
        System.out.println("MaxAvg = " + maxAvg);
    }

}
