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
    public void reorderList(ListNode head) {
      if (head == null || head.next == null) 
        return;
        ListNode mid = mid(head);
        ListNode second = reverse(mid.next);
        mid.next = null;
        ListNode first = head;
        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
     }
    }
    public static ListNode mid(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static ListNode reverse(ListNode mid){
        ListNode current = mid;
        ListNode prev=null;
        while(current!=null){
           ListNode ahead= current.next;
           current.next=prev;
           prev=current;
           current=ahead;
        }
        return prev;
    }
}