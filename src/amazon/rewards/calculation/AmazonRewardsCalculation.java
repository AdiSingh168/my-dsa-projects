package amazon.rewards.calculation;

import java.util.Comparator;
import java.util.List;

class AmazonRewardsCalculation {

    int solution(List<Integer> input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        int secondHighestVal = input.stream().max(Comparator.naturalOrder()).get() - 1;
        return (int) input.stream().filter(num -> num >= secondHighestVal).count();
    }

}
