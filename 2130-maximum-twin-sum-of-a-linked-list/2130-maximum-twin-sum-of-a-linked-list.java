/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer>list=new ArrayList<>();
        ListNode ptr=head;
        while(ptr!=null)
        {
            list.add(ptr.val);
            ptr=ptr.next;
        }
        int left=0;
        int right=list.size()-1;
        int ans=0;
        while(left<right)
        {
            ans=Math.max(ans,list.get(left)+list.get(right));
            left++;
            right--;
        }
        return ans;
    }
}