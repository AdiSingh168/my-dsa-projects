package amazon.rewards.calculation;

import java.util.ArrayList;
import java.util.List;

public class AmazonRewardsCalculationMain {

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            input.add(98);
            input.add(100);
        }
        /*input.add(4);
        input.add(2);
        input.add(7);
        input.add(1);*/

        AmazonRewardsCalculation solution = new AmazonRewardsCalculation();
        System.out.println(solution.solution(input));

    }

}
