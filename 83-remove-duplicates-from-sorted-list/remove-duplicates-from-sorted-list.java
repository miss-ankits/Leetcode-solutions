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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode temp=head;
        ListNode front=temp.next;
        while(front!=null){
            if(temp.val==front.val){
                while(front!=null && temp.val==front.val){
                    front=front.next;
                }
                temp.next=front;
            }
            else{
                temp=temp.next;
            }
            front=temp.next;
        }
        return head;
    }
}