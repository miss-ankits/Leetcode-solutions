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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head;
        for(int i=1;i<k;i++){
        first=first.next; //kth node from start
        }
        ListNode curr=first;
        ListNode second=head;

        while(curr.next!=null){ //kth node from end
            second=second.next;
            curr=curr.next;
        }
        int temp=first.val; //swap
        first.val=second.val;
        second.val=temp;
        return head;
    }
}