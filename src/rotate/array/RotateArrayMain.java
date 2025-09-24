package rotate.array;

public class RotateArrayMain {

    static void print(int[] nums) {
        System.out.print("{\t");

        for (int num : nums) {
            System.out.print(num + "\t");
        }

        System.out.print("}");
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Before rotation:\n");
        print(nums);
        System.out.println("\n\n");

        RotateArray solution = new RotateArray();
//        solution.solutionWithOnkTimeComplexityAndO1SpaceComplexity(nums, k);
//        solution.solutionWithOnTimeComplexityAndOnSpaceComplexity(nums, k);
        solution.solutionWithOnTimeComplexityAndO1SpaceComplexity(nums, k);

        System.out.println("After rotation:\n");
        print(nums);
        System.out.println("\n\n");
    }


}
