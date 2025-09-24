package minimum.path.sum.triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumPathSumTriangleMain {

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(2));
        triangle.add(List.of(3, 4));
        triangle.add(List.of(6, 5, 7));
        triangle.add(List.of(4, 1, 8, 3));


        MinimumPathSumTriangle solution = new MinimumPathSumTriangle();
        System.out.println(solution.solution(triangle));

    }

}
