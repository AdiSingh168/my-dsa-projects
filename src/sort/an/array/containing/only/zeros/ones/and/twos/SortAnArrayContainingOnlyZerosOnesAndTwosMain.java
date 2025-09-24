package sort.an.array.containing.only.zeros.ones.and.twos;

class SortAnArrayContainingOnlyZerosOnesAndTwosMain {

    public static void main(String[] args) {
        int[] input = {0, 0, 0, 2, 0, 0, 0, 0, 2};
        System.out.println("Before sorting:-");
        printList(input);
        SortAnArrayContainingOnlyZerosOnesAndTwos solution = new SortAnArrayContainingOnlyZerosOnesAndTwos();
        solution.solution(input);
        System.out.println("After sorting:-");
        printList(input);

    }

    static void printList(int[] input) {
        for (int val : input) {
            System.out.print(val + ",\t");
        }
        System.out.println();
    }

}
