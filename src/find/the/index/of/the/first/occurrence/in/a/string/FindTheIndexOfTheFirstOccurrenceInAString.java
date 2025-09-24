package find.the.index.of.the.first.occurrence.in.a.string;

class FindTheIndexOfTheFirstOccurrenceInAString {

    int solution(String haystack, String needle) {
        if (haystack == null || haystack.isEmpty() || needle == null || needle.isEmpty() || needle.length() > haystack.length()) {
            return -1;
        }
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        int i = 0;
        while (i <= haystackLength - needleLength) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                String searchString = haystack.substring(i, i + needleLength);
                if (searchString.equals(needle)) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

}
