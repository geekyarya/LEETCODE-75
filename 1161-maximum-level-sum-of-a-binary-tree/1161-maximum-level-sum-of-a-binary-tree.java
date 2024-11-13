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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();

        q.offer(root);
        int max,ans=Integer.MIN_VALUE,i=1,level=0;
        while(!q.isEmpty()){
            max=0;
            int size=q.size();
            while(size-->0){
                TreeNode cur=q.poll();
                max+=cur.val;
                if(cur.left!=null)
                q.offer(cur.left);
                if(cur.right!=null)
                q.offer(cur.right);
            }
            if(max>ans)
            {
                ans=max;
                level=i;
            }
            i++;
        }
        return level;
    }
}