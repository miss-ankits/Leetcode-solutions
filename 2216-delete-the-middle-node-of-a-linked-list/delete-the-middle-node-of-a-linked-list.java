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
        if(head == null || head.next ==null) return null;
//         ListNode slow=head;
//         ListNode fast=head.next;
//         while(fast.next!=null && fast.next.next!=null){
//             slow=slow.next; //stops at prev of mid node.
//             fast=fast.next.next;
//         }
//         slow.next=slow.next.next;
//         return head;
//     }
// }
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;

        while(fast!=null && fast.next!=null){
            prev=slow; //to track node before the mid
            slow=slow.next; //mid node
            fast=fast.next.next;
        }
        prev.next=prev.next.next;
        return head;
    }
}
