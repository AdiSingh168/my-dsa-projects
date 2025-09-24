package shortest.palindrome;

class ShortestPalindrome {

    String solution(String input) {
        String reversedString = new StringBuffer(input).reverse().toString();
        int n = input.length();
        String output = "";
        for (int i = 0; i < n; i++) {
            if (input.startsWith(reversedString.substring(i))) {
                output = reversedString + input.substring(n - i);
                break;
            }
        }
        return output;
    }

}
