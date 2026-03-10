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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode mid=middle(head); //find mid
        ListNode leftHead=head; //left part
        ListNode rightHead=mid.next; //right part
        mid.next=null;
        leftHead=sortList(leftHead);
        rightHead=sortList(rightHead);
        return merge(leftHead,rightHead);
    }
        public ListNode middle(ListNode head){
        ListNode fast=head.next;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            }
            return slow;
        }
        
    public ListNode merge(ListNode node1,ListNode node2){
        ListNode dummyNode = new ListNode(-1);
        ListNode temp= dummyNode;
        while(node1!=null && node2!=null){
            if(node1.val>node2.val){
            temp.next=node2;
            temp=node2;
            node2=node2.next;
            }
            else{
                temp.next=node1;
                temp=node1;
                node1=node1.next;
            }
        }
        if(node1!=null){ //leftover nodes
            temp.next=node1;
        }else{
            temp.next=node2;
        }
        return dummyNode.next;
    }
}