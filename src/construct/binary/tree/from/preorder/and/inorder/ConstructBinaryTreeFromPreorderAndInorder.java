package construct.binary.tree.from.preorder.and.inorder;

import java.util.HashMap;
import java.util.Map;

class ConstructBinaryTreeFromPreorderAndInorder {

    TreeNode solution(int[] preOrder, int[] inOrder) {
        if (preOrder == null || preOrder.length == 0) {
            return null;
        } else if (preOrder.length == 2) {
            return new TreeNode(preOrder[0]);
        }
        int n = inOrder.length;
        Map<Integer, Integer> inOrderMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            inOrderMap.put(inOrder[i], i);
        }
        return constructTree(preOrder, inOrderMap, 0, 0, n - 1, n - 1);

    }

    TreeNode constructTree(int[] preOrder, Map<Integer, Integer> inOrderMap, int preOrderStart, int inOrderStart, int preOrderEnd, int inOrderEnd) {
        if (preOrderStart > preOrderEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preOrder[preOrderStart]);
        int rootLocation = inOrderMap.get(root.data);
        root.left = constructTree(preOrder, inOrderMap, preOrderStart + 1, inOrderStart, preOrderStart + (rootLocation - inOrderStart), rootLocation - 1);
        root.right = constructTree(preOrder, inOrderMap, preOrderStart + (rootLocation - inOrderStart) + 1, rootLocation + 1, preOrderEnd, inOrderEnd);
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
