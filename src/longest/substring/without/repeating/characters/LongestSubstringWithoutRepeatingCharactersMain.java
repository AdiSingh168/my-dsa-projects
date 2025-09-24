package longest.substring.without.repeating.characters;

public class LongestSubstringWithoutRepeatingCharactersMain {

    public static void main(String[] args) {
        // getting input, print input
        String input = "pwwkew";
        System.out.println("Input string: " + input);

        // know the maximum possible substring
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        int max = solution.solution(input);

        // print output
        System.out.println("Longest substring without repeating characters contains: " + max + " characters");
    }

}
