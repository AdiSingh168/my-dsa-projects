package search.in.a.rotated.sorted.array;

public class SearchInARotatedSortedArrayMain {

    public static void main(String[] args){
        // input
        int[] input = {4,5,6,7,0,1,2};
        int val = 3;

        // find element
        SearchInARotatedSortedArray searchInARotatedSortedArray = new SearchInARotatedSortedArray();
        int index = searchInARotatedSortedArray.solution(input, val);

        //display
        System.out.println(index);
    }

}
