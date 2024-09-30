/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode l,r;
        if(root == null)
        return null;
        if(root==p || root ==q)
        return root;
        l=lowestCommonAncestor(root.left,p,q);
        r=lowestCommonAncestor(root.right,p,q);
        if(l!=null && r!=null)
        return root;
        if(l!=null)
        return l;
        else
        return r;
    }
}