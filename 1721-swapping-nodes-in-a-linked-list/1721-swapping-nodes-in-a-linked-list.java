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
    public ListNode swapNodes(ListNode head, int k) {
       int n=0;
       ListNode temp=head;
       while(temp!=null){
        temp=temp.next;
        n++;
       }
       System.out.print(n);
       ListNode swap=head;
       ListNode swap1=head;

       for(int i=0;i<k-1;i++){
          swap=swap.next;
       }

       for(int i=0;i<n-k;i++){
        swap1=swap1.next;
       }
       int t=swap.val;
       swap.val=swap1.val;
       swap1.val=t;

       return head; 
    }
}