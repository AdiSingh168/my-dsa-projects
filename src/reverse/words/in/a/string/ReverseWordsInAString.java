package reverse.words.in.a.string;

class ReverseWordsInAString {

    String solution(String input) {
        String[] output = input.trim().split("\\s+");
        StringBuffer result = new StringBuffer();
        for (int i = output.length - 1; i > 0; i--) {
            result.append(output[i]).append(' ');
        }
        return result.append(output[0]).toString();
    }

}
