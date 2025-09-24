package minimum.number.of.arrows.to.burst.balloons;

import java.util.*;

class MinimumNumberOfArrowsToBurstBalloons {

    int solution(int[][] points) {

        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int[] oldPoints = points[0];
        int count = 1;

        for (int i = 1; i < points.length; i++) {
            if (oldPoints[1] < points[i][0]) {
                oldPoints = points[i];
                count++;
            } else {
                oldPoints[0] = Integer.max(oldPoints[0], points[i][0]);
                oldPoints[1] = Integer.min(oldPoints[1], points[i][1]);
            }
        }
        return count;
    }

}
