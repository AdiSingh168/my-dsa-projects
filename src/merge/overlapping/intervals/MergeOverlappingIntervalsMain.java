package merge.overlapping.intervals;

public class MergeOverlappingIntervalsMain {

    public static void main(String[] args) {
        // get input, print input
//        int[][] input = {{1, 4}, {4, 5}};
        int[][] input = {};
        System.out.println("Input:");
        print(input);

        // mergeIntervals
        MergeOverlappingIntervals solution = new MergeOverlappingIntervals();
        int[][] output = solution.solution(input);

        // print output
        System.out.println("Output:");
        print(output);

    }

    static void print(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        System.out.print("[\t");
        for (int[] array : matrix) {
            System.out.print("{" + array[0] + "," + array[1] + "}\t");
        }
        System.out.println("]\n");
    }

}
