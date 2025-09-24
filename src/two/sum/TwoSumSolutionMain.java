package two.sum;

public class TwoSumSolutionMain {
    public static void main(String[] args) {
        //get input
        int[] input = null;
        int sum = 9;

        //call out method
        TwoSumSolution solutionCaller = new TwoSumSolution();
        int[] output = solutionCaller.solution(input, sum);

        //display output
        System.out.println(output[0] + "\t" + output[1]);

    }
}
