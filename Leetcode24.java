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
    public ListNode swapPairs(ListNode head) {
        
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        
        ListNode temp=head;
        head=head.next;
        ListNode prev=null;
        while(temp!=null && temp.next!=null){
            ListNode p=temp;
            temp=temp.next;
            p.next=temp.next;
            temp.next=p;

            if(prev!=null){
                prev.next=temp;
            }
            prev=p;
            temp=p.next;
        }

        return head;
    }
}