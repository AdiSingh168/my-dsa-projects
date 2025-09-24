package wordbreak;

public class WordBreakMain {

    public static void main(String[] args) {
        // get the inputs
        String[] wordDict = {"aaaa", "aaa"};
        String input = "aaaaaaa";

        // compute and print result
        WordBreak solution = new WordBreak();
        System.out.println(solution.solution(wordDict, input));
    }

}
