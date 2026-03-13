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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode kthNode=findNode(temp,k);
            if(kthNode==null){
                if(prev!=null){
                prev.next=temp;
                break;
                }
            }
            ListNode nextNode=kthNode.next;
            kthNode.next=null;
            ListNode rev=reverseLinkedList(temp);
            if(temp==head) head=kthNode;
            else prev.next=kthNode;
            prev=temp;
            temp=nextNode;
        }
        return head;
    }
    ListNode findNode(ListNode temp,int k){
            k-=1;
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }

    ListNode reverseLinkedList(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
        ListNode front=temp.next;
        temp.next=prev;
        prev=temp;
        temp=front;
        //front=front.next;
    }
    return prev;
    }
}