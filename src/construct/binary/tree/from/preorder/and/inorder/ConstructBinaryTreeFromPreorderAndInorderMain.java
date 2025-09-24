package construct.binary.tree.from.preorder.and.inorder;

public class ConstructBinaryTreeFromPreorderAndInorderMain {

    public static void main(String[] args) {
        // get input
        int[] preOrder = {6, 4, 2, 1, 3, 5, 10, 7, 9, 8, 11};
        int[] inOrder = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};


        // output
        ConstructBinaryTreeFromPreorderAndInorder solution = new ConstructBinaryTreeFromPreorderAndInorder();
        TreeNode output = solution.solution(preOrder, inOrder);
        System.out.println("Done");
    }

}
