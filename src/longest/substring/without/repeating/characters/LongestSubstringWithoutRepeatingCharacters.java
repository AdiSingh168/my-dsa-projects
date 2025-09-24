package longest.substring.without.repeating.characters;

import java.util.HashSet;

class LongestSubstringWithoutRepeatingCharacters {

    int solution(String input) {
        if (input == null || input.isBlank()) {
            return 0;
        }
        int start = 0;
        int maxLength = 1;
        HashSet<Character> characters = new HashSet<>();
        for (int end = 0; end < input.length(); end++) {
            while (characters.contains(input.charAt(end))) {
                characters.remove(input.charAt(start));
                start++;
            }
            characters.add(input.charAt(end));
            maxLength = Integer.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

}
