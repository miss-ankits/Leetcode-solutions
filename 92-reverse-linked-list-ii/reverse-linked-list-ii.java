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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right) return head;
        ListNode dummyNode=new ListNode(-1);
        dummyNode.next=head;
        ListNode prev=dummyNode;
        for(int i=0;i<left-1;i++){
            prev=prev.next;
        }
        ListNode curr=prev.next; //preserve node
        for(int i=left;i<right;i++){
            ListNode front=curr.next;
            curr.next=front.next;
            front.next=prev.next;
            prev.next=front;
        }
        return dummyNode.next;
    }
}