package wordbreak;

import java.util.Arrays;
import java.util.HashSet;

class WordBreak {

    boolean solution(String[] wordDict, String input) {
        HashSet<String> words = new HashSet<String>(Arrays.asList(wordDict));
        int n = input.length();
        boolean[] dp = new boolean[n + 1];
        Arrays.fill(dp, false);
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && words.contains(input.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }

}
