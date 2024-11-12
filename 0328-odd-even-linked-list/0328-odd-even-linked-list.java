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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode ptr1=head;
        ListNode ptr2=head.next;
        ListNode maintain=head.next;
        while(ptr1.next!=null && ptr2.next!=null)
        {
            ptr1.next=ptr2.next;
            ptr1=ptr1.next;
            ptr2.next=ptr1.next;
            ptr2=ptr2.next;
        }
        ptr1.next=maintain;
        return head;
    }
}

















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
// class Solution {
//     public ListNode oddEvenList(ListNode head) {
//         if(head == null)
//             return head;
//         ListNode result = head;
//         ListNode p1 = head;
//         ListNode p2 = head.next;
//         ListNode connectNode = head.next;
//         while(p1 != null && p2 != null)
//         {
//             ListNode t = p2.next;
//             if(t == null)
//                 break;
//             p1.next = p2.next;
//             p1 = p1.next;
//             p2.next = p1.next;
//             p2 = p2.next;
//         }
//         p1.next = connectNode;
//         return result;
//     }
// }