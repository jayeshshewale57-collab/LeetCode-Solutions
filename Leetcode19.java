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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head==null){
            return null;
        }

        if(head.next==null){
            head=null;
            return null;
        }

        int i=0,count=0;
        ListNode temp=head;

        while(temp!=null){
            temp=temp.next;
            count++;
        }

        if(n==count){
            return head.next;
        }

        temp=head;
        ListNode p=head;
        while(i!=count-n){
            p=temp;
            temp=temp.next;
            i++;
        }
        p.next=temp.next;
        temp=null;

        return head;
    }
}