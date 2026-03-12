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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead=new ListNode(-1);
        ListNode temp=dummyHead;
        ListNode node1=l1;
        ListNode node2=l2;
        int carry=0;
        while(node1!=null || node2!=null){
        int sum=carry;
        if(node1!=null) sum+=node1.val;
        if(node2!=null) sum+=node2.val;
            ListNode newNode=new ListNode(sum%10);
            carry=sum/10;

            temp.next=newNode;
            temp=newNode;

            if(node1!=null) node1=node1.next;
            if(node2!=null) node2=node2.next;
        }
        if(carry==1){
            ListNode node=new ListNode(carry);
            temp.next=node;
        }
        return dummyHead.next;
        }
    }