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
    ListNode reverse(ListNode start,ListNode end){
        ListNode a=null;
        ListNode b=start;
        while(b!=end){
        ListNode c=b.next;
           b.next=a;
           a=b;
           b=c;
        }
     return a;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode tail=head;
        for(int i=0;i<k;i++){
            if(tail==null){
                return head;
            }
            tail=tail.next;
        }
        ListNode newnode=reverse(head,tail);
        head.next=reverseKGroup(tail,k);
        return newnode; 
    }
}