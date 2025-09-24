package wordbreak.two;

import java.util.*;

class WordBreakTwo {

    List<String> solution(String input, List<String> wordDict) {
        HashSet<String> wordsOfDict = new HashSet<>();
        for (String word : wordDict) {
            wordsOfDict.add(word);
        }

        int n = input.length();

        List<List<String>> dp = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            dp.add(new ArrayList<>());
        }
        dp.add(0, List.of(""));
        for (int i = 1; i <= n; i++) {
            List<String> tempList = new LinkedList<>();
            for (int j = 0; j < i; j++) {
                String substring = input.substring(j, i);
                if (wordsOfDict.contains(substring)) {
                    for (String s : dp.get(j)) {
                        tempList.add(s + (s.isBlank() ? "" : " ") + substring);
                    }
                }
            }
            dp.add(i, tempList);
        }

        Collections.reverse(dp.get(n));
        return dp.get(n);

    }

}
