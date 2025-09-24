package dfs.postorder;

import dfs.TreeNode;

public class DFSPostOrderTraversal {

    public String solution(TreeNode node) {
        StringBuffer output = new StringBuffer();
        postOrder(output, node);
        return output.toString();
    }

    void postOrder(StringBuffer output, TreeNode node) {
        if (node == null) {
            return;
        }

        postOrder(output, node.left);
        postOrder(output, node.right);
        output.append(node.data).append(" ");
    }

}
