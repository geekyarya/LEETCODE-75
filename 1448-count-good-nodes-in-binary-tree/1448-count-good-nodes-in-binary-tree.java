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
    public int goodNodes(TreeNode root) {
        return helper(root,0,Integer.MIN_VALUE);
    }
    public int helper(TreeNode root,int ans,int currentMax){
        if(root==null)
        return 0;

        int currentans=0;
        if(root.val>=currentMax){
            currentMax=root.val;
            currentans=1;
        }
        int lroot=helper(root.left,ans,currentMax);
        int rroot=helper(root.right,ans,currentMax);
        return lroot+rroot+currentans;
    }
}