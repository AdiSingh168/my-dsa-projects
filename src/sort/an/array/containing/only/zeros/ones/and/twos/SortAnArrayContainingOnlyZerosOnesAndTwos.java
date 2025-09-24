package sort.an.array.containing.only.zeros.ones.and.twos;

class SortAnArrayContainingOnlyZerosOnesAndTwos {

    void solution(int[] input) {
        if (input == null || input.length == 0 || input.length == 1) {
            return;
        }

        int low = 0, mid = 0, high = input.length - 1;
        while (mid <= high) {
            if (input[mid] == 0) {
                input[mid] = input[low];
                input[low] = 0;
                low++;
            } else if (input[mid] == 2) {
                input[mid] = input[high];
                input[high] = 2;
                high--;
            }
            mid++;
        }
    }

}
