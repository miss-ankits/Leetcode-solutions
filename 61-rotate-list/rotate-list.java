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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        ListNode curr=head;
        if(head==null || head.next==null) return head;
        int len=1;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        temp.next=head;
        k=k%len;
        int n=len-k;
        int i=1;
        while(i<n){
            curr=curr.next;  
            i++;          
        }
        ListNode front=curr.next;
        curr.next=null;
        return front;
    }
}