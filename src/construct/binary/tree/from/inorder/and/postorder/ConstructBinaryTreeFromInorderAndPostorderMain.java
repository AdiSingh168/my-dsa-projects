package construct.binary.tree.from.inorder.and.postorder;

public class ConstructBinaryTreeFromInorderAndPostorderMain {

    public static void main(String[] args) {
        int[] postorder = {1, 3, 2, 5, 4, 8, 9, 7, 11, 10, 6};
        int[] inorder = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        ConstructBinaryTreeFromInorderAndPostorder solution = new ConstructBinaryTreeFromInorderAndPostorder();
        TreeNode output = solution.solution(inorder, postorder);
        System.out.println("Done");

    }

}
