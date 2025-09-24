package merge.overlapping.intervals;

import java.util.Arrays;
import java.util.LinkedList;

class MergeOverlappingIntervals {

    int[][] solution(int[][] input) {
        if (input == null) {
            return new int[0][];
        } else if(input.length < 2){
            return input;
        }
        LinkedList<int[]> intervals = new LinkedList<>();
        Arrays.sort(input, (a, b) -> Integer.compare(a[0], b[0]));

        for (int[] curr : input) {
            if (intervals.isEmpty() || intervals.getLast()[1] < curr[0]) {
                intervals.add(curr);
            } else {
                int[] lastInterval = intervals.getLast();
                if (lastInterval[1] >= curr[0]) {
                    lastInterval[1] = Integer.max(lastInterval[1], curr[1]);
                }
            }
        }

        return intervals.toArray(new int[intervals.size()][]);
    }

}
