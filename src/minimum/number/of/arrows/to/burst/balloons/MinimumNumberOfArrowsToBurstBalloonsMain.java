package minimum.number.of.arrows.to.burst.balloons;

public class MinimumNumberOfArrowsToBurstBalloonsMain {

    public static void main(String[] args) {
        int[][] input = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};



        MinimumNumberOfArrowsToBurstBalloons solution = new MinimumNumberOfArrowsToBurstBalloons();
        System.out.println(solution.solution(input));
    }

}
