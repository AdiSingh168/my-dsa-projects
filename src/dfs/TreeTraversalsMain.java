package dfs;

import dfs.inorder.DFSInOrderTraversal;
import dfs.levelorder.BFSLevelOrderTraversal;
import dfs.postorder.DFSPostOrderTraversal;
import dfs.preorder.DFSPreOrderTraversal;

public class TreeTraversalsMain {

    public static void main(String[] args) {
        TreeNode node = new TreeNode("F");

        node.left = new TreeNode("D");
        node.right = new TreeNode("J");

        node.left.left = new TreeNode("B");
        node.left.right = new TreeNode("E");

        node.left.left.left = new TreeNode("A");
        node.left.left.right = new TreeNode("C");

        node.right.left = new TreeNode("G");
        node.right.right = new TreeNode("K");

        node.right.left.right = new TreeNode("I");

        node.right.left.right.left = new TreeNode("H");

        DFSPreOrderTraversal solution = new DFSPreOrderTraversal();
        System.out.println("DFS PreOrder Traversal\n" + solution.solution(node) + "\n");

        DFSInOrderTraversal solution2 = new DFSInOrderTraversal();
        System.out.println("DFS InOrder Traversal\n" + solution2.solution(node) + "\n");

        DFSPostOrderTraversal solution3 = new DFSPostOrderTraversal();
        System.out.println("DFS PostOrder Traversal\n" + solution3.solution(node) + "\n");

        BFSLevelOrderTraversal solution4 = new BFSLevelOrderTraversal();
        System.out.println("BFS LevelOrder Traversal\n" + solution4.solution(node) + "\n");

    }

}
