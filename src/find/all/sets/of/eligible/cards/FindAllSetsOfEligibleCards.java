package find.all.sets.of.eligible.cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindAllSetsOfEligibleCards {

    Map<Long, List<int[]>> outputMap = new HashMap<>();

    private void func(int[] arr, long bitMask, Set<Long> dp, List<int[]> output) {
        if (dp.contains(bitMask)) {
            return;
        }
        List<Integer> unread = getActiveIndices(bitMask, arr.length);
        if (unread.size() < 3) {
            return;
        }

        for (int i = 0; i < unread.size(); i++) {
            for (int j = i + 1; j < unread.size(); j++) {
                for (int k = j + 1; k < unread.size(); k++) {
                    if (isPossible(arr[unread.get(i)], arr[unread.get(j)], arr[unread.get(k)])) {
                        long newBitMask = (bitMask | 1L << unread.get(i) | 1L << unread.get(j) | 1L << unread.get(k));
                        if (!dp.contains(newBitMask)) {
                            List<int[]> newOutput = new ArrayList<>(output);
                            newOutput.add(new int[]{arr[unread.get(i)], arr[unread.get(j)], arr[unread.get(k)]});
                            outputMap.put(newBitMask, newOutput);
                            func(arr, newBitMask, dp, newOutput);
                            dp.add(newBitMask);
                        }
                    }
                }
            }
        }
    }

    private List<Integer> getActiveIndices(long bitMask, int length) {
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if ((bitMask & (1L << i)) == 0) {
                output.add(i);
            }
        }
        return output;
    }

    private boolean isPossible(int... nums) {
        Arrays.sort(nums);
        return ((nums[0] == nums[1] && nums[1] == nums[2]) || (nums[0] + 1 == nums[1] && nums[1] + 1 == nums[2]));
    }

    private List<int[]> getOptimalSolution() {
        List<int[]> output = null;
        int count = Integer.MIN_VALUE;
        for (Map.Entry<Long, List<int[]>> entry : outputMap.entrySet()) {
            int size = entry.getValue().size();
            if (size > count) {
                output = entry.getValue();
                count = size;
            }
        }
        return output;
    }

    public List<int[]> solution(int[] arr) {
        Set<Long> dp = new HashSet<>();
        func(arr, 0L, dp, new ArrayList<int[]>());
        return getOptimalSolution();
    }

}
