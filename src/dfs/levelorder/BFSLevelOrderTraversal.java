package dfs.levelorder;

import dfs.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BFSLevelOrderTraversal {

    public String solution(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        StringBuffer output = new StringBuffer();
        bfs(output, queue);
        return output.toString();
    }

    void bfs(StringBuffer output, Queue<TreeNode> queue) {
        if (queue.isEmpty()) {
            return;
        }
        TreeNode element = queue.poll();
        output.append(element.data).append(" ");
        if (element.left != null) {
            queue.add(element.left);
        }
        if (element.right != null) {
            queue.add(element.right);
        }
        bfs(output, queue);
    }

}
