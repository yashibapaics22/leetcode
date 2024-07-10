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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode current = head.next;
        ListNode tail = dummy;
        int sum = 0;
        while (current != null) {
            if (current.val != 0) {
                sum += current.val;
            } else {
                tail.next = new ListNode(sum);
                tail = tail.next;
                sum = 0;
            }
            current = current.next;
        }
        return dummy.next;
    }
}
