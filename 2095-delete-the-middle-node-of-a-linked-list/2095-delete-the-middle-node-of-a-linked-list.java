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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null ||head.next==null)
        return null;
        ListNode mid=findmiddle(head);
        ListNode curr=head;
        while(curr.next!=mid)
        {
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
    public ListNode findmiddle(ListNode head)
    {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}