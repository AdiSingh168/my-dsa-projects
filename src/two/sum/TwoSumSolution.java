package two.sum;

import java.util.HashMap;

class TwoSumSolution {

    public int[] solution(int[] input, int sum) {
        if(input == null){
            return new int[]{-1, -1};
        }
        HashMap<Integer, Integer> complementsMap = new HashMap<>();
        int n = input.length;
        for (int i = 0; i < n; i++) {
            int complement = sum - input[i];
            if (complementsMap.containsKey(input[i])) {
                return new int[]{complementsMap.get(input[i]), i};
            }
            complementsMap.put(complement, i);
        }
        return new int[]{-1, -1};
    }

}
