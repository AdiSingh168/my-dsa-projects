package subarrays.sum.equals.k;

public class SubarraySumEqualsKMain {

    public static void main(String[] args) {
        int[] arr = {23, 50, 30, 95, 5, 81, 66, 21, 36, 75, 92, 59, 47, 93, 29, 13, 88, 22, 49, 32};
        int k = 32;

        SubarraySumEqualsK solution = new SubarraySumEqualsK();
        System.out.println(solution.solve(arr.length, k, arr));
    }

}
