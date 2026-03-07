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
    public boolean isPalindrome(ListNode head) {
        //two Pointer
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
    Stack<Integer> st=new Stack<>();
    ListNode curr=head;
    while(curr!=null){
        st.push(curr.val);
        curr=curr.next;
    }
    curr=head;
    while(curr!=null && st.pop()==curr.val){
        curr=curr.next;
    }
    return curr==null;
    }
    
}