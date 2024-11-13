/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int maxZigZag = 0;

    public int longestZigZag(TreeNode root) {
        if (root == null) {
            return 0;
        }
        helper(root.left, true, 1);
        helper(root.right, false, 1);
        return maxZigZag;
    }

    private void helper(TreeNode root, boolean goLeft, int length) {
        if (root == null) {
            return;
        }
        maxZigZag = Math.max(maxZigZag, length);
        
        if (goLeft) {
            helper(root.left, true, 1);
            helper(root.right, false, length + 1);
        } else {
            helper(root.right, false, 1);
            helper(root.left, true, length + 1);
        }
    }
}
