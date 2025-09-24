package search.in.a.rotated.sorted.array;

class SearchInARotatedSortedArray {

    int solution(int[] input, int val) {
        if (input == null || input.length == 0) {
            return -1;
        }

        int low = 0, high = input.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (input[mid] == val) {
                return mid;
            }
            if (input[low] <= input[mid]) {
                if (val >= input[low] && val < input[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (val > input[mid] && val <= input[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    /*

    {4,5,6,7,0,1,2} -> 0
    n=7,
    start=4

    mid = 0, high = 3, low = 4

     */

}
