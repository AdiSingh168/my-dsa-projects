package construct.binary.tree.from.inorder.and.postorder;

import java.util.HashMap;
import java.util.Map;

class ConstructBinaryTreeFromInorderAndPostorder {

    TreeNode solution(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length == 0) {
            return null;
        } else if (inorder.length == 1) {
            return new TreeNode(inorder[0]);
        }

        int n = inorder.length;
        Map<Integer, Integer> nodesMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            nodesMap.put(inorder[i], i);
        }

        return construct(postorder, nodesMap, 0, n - 1, 0, n - 1);
    }

    TreeNode construct(int[] postorder, Map<Integer, Integer> nodesMap, int postOrderStart, int postOrderEnd, int inOrderStart, int inOrderEnd) {
        if (postOrderStart > postOrderEnd || inOrderStart > inOrderEnd) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[postOrderEnd]);
        int rootLocation = nodesMap.get(postorder[postOrderEnd]);
        root.left = construct(postorder, nodesMap, postOrderStart, postOrderStart + (rootLocation - inOrderStart) - 1, inOrderStart, rootLocation - 1);
        root.right = construct(postorder, nodesMap, postOrderStart + (rootLocation - inOrderStart), postOrderEnd - 1, rootLocation + 1, inOrderEnd);

        return root;
    }

}


class TreeNode {

    int data;
    TreeNode left, right;

    TreeNode() {
    }

    TreeNode(int data) {
        this.data = data;
    }

}
