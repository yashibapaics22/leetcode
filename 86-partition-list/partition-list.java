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
    public ListNode partition(ListNode head, int x) {
        // Handle edge cases
        if (head == null || head.next == null)
            return head;

        // Two dummy nodes to act as the heads of two lists
        ListNode ll1 = new ListNode(0);
        ListNode ll2 = new ListNode(0);
        
        // Pointers to the current end of the two lists
        ListNode ll1head = ll1;
        ListNode ll2head = ll2;
        
        ListNode curr = head;
        while (curr != null) {
            if (curr.val < x) {
                ll1.next = curr;
                ll1 = ll1.next;
            } else {
                ll2.next = curr;
                ll2 = ll2.next;
            }
            curr = curr.next;
        }
        
        // Avoiding cycle in the linked list
        ll2.next = null;
        
        // Connecting the two lists
        ll1.next = ll2head.next;
        
        // The new head is the next node after the dummy node of the first list
        return ll1head.next;
    }
}
