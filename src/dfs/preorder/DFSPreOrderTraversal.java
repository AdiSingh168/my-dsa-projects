package dfs.preorder;

import dfs.TreeNode;

public class DFSPreOrderTraversal {

    public String solution(TreeNode node) {
        StringBuffer output = new StringBuffer();
        preOrder(output, node);
        return output.toString();
    }

    void preOrder(StringBuffer output, TreeNode node) {
        if (node == null) {
            return;
        }
        output.append(node.data).append(" ");
        preOrder(output, node.left);
        preOrder(output, node.right);
    }

}
