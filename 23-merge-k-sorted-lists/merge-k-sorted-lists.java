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
    public ListNode mergeKLists(ListNode[] lists) {
        //[[1,4,5] -> arr[0] //l1
        //[1,3,4] -> arr[1] //l2
        //[2,6]] -> arr[2];
        if (lists==null || lists.length==0){
            return null;
        }
        while(lists.length>1){ //merge two lists each until it becomes 1
            List<ListNode> temp = new ArrayList<>();
            for(int i=0;i<lists.length;i+=2){
                ListNode l1=lists[i];
                ListNode l2=i+1<lists.length ? lists[i+1] : null; 
                temp.add(mergeTwoLists(l1,l2));
            }
            lists=temp.toArray(new ListNode[0]);
            
        }
        return lists[0];
    }
    private ListNode mergeTwoLists(ListNode l1,ListNode l2){ 
        ListNode node =new ListNode();
        ListNode ans=node;
        while(l1!=null && l2!=null){
            if(l1.val>l2.val){
                node.next=l2;
                l2=l2.next;
            }else{
                node.next=l1;
                l1=l1.next;
            }
            node=node.next;
        }
        node.next=l1!=null ? l1 : l2; // if l1!=null node.next=l1 or node.next=l2;
        return ans.next;
    }
}