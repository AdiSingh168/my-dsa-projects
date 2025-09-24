package container.with.most.water;

class ContainerWithMostWater {

    int solution(int[] height) {
        int n = height.length;
        int maxArea = 0;
        int left = 0, right = n - 1;
        while (left < right) {
            int area = Integer.min(height[left], height[right]) * (right - left);
            maxArea = Integer.max(area, maxArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

}
