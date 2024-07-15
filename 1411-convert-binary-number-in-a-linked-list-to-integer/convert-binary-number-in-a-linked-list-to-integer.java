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
    public int getDecimalValue(ListNode head) {
        int sum=0;
        ListNode curr= reverse(head);
        int i=0;
        while(curr!=null){
            sum=sum+((int)Math.pow(2,i)*curr.val);
            i++;
            curr=curr.next;
        }
        return sum;
    }
    public static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode ahead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }
        return prev;
    }
}