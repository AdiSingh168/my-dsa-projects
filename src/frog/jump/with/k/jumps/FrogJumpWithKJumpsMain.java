package frog.jump.with.k.jumps;

public class FrogJumpWithKJumpsMain {

    public static void main(String[] args) {
        int[] heights = {10, 5, 20, 0, 15};
        int k = 2;

        FrogJumpWithKJumps solution = new FrogJumpWithKJumps();
        System.out.println(solution.solution(heights, k));
    }

}
