package wordbreak.two;

import java.util.*;

public class WordBreakTwoMain {

    public static void main(String[] args) {
        List<String> wordDict = List.of("apple", "pen", "applepen", "pine", "pineapple");
        String input = "pineapplepenapple";

        WordBreakTwo solution = new WordBreakTwo();
        System.out.println(solution.solution(input, wordDict));
    }

}
