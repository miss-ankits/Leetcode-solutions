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
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev; //new head
    }
    public boolean isPalindrome(ListNode head) {

    ListNode fast=head;
    ListNode slow=head;
    while(fast.next!=null && fast.next.next!=null){ //find mid node
        fast=fast.next.next;
        slow=slow.next;
    }
    ListNode rev=reverse(slow.next); //reverse the second half
    //slow.next=null;
    ListNode temp=head;
    ListNode second=rev;
    while(second!=null){
        if(temp.val!=second.val) {
            //slow.next=reverse(second);
            return false;
        }
    second=second.next;
    temp=temp.next;
    }
    //slow.next=reverse(second);
    return true;
    }
    

    //two Pointer using ArrayList
    //     List<Integer> list=new ArrayList<>();
    //     while(head!=null){
    //         list.add(head.val);
    //         head=head.next;
    //     }
    //     int left=0;int right=list.size()-1;
    //     while(left<right && list.get(left)==list.get(right)){
    //             left++;
    //             right--;
    //     }
    //     return left>=right;
    // }

    //stack
    // Stack<Integer> st=new Stack<>();
    // ListNode curr=head;
    // while(curr!=null){
    //     st.push(curr.val);
    //     curr=curr.next;
    // }
    // curr=head;
    // while(curr!=null && st.pop()==curr.val){
    //     curr=curr.next;
    // }
    // return curr==null;
    // }
}