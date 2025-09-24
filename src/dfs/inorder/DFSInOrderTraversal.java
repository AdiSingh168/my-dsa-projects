package dfs.inorder;

import dfs.TreeNode;

public class DFSInOrderTraversal {

    public String solution(TreeNode node) {
        StringBuffer output = new StringBuffer();
        inOrderTraversal(output, node);
        return output.toString();
    }

    void inOrderTraversal(StringBuffer output, TreeNode node) {
        if (node == null) {
            return;
        }

        inOrderTraversal(output, node.left);
        output.append(node.data).append(" ");
        inOrderTraversal(output, node.right);
    }

}
