package ninjas.training;

public class NinjasTrainingMain {

    public static void main(String[] args) {
        int[][] points = new int[][]{{1, 2, 5}, {3, 1, 1}, {3, 3, 3}};

        NinjasTraining solution = new NinjasTraining();
        System.out.println(solution.solution(points));
    }

}
