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
        // Convert linked list to an ArrayList
        ListNode temp = head;
        List<Integer> ll = new ArrayList<>();
        while (temp != null) {
            ll.add(temp.val);
            temp = temp.next;
        }

        // Swap the k-th node from the beginning and the k-th node from the end
        int n = ll.size();
        swap(ll, k - 1, n - k);

        // Convert the ArrayList back to a linked list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : ll) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }

    public static void swap(List<Integer> ll, int a, int b) {
        int temp = ll.get(a);
        ll.set(a, ll.get(b));
        ll.set(b, temp);
    }
}
