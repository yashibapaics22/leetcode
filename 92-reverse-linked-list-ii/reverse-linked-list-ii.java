class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // Handle edge cases where the list is empty or has only one node
        if (head == null || head.next == null)
            return head;

        // Create a dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Initialize pointers to traverse the list
        ListNode curr = head;
        ListNode prev = dummy;

        // Move the pointers to the start of the sublist
        for (int i = 1; i < left; i++) {
            curr = curr.next;
            prev = prev.next;
        }
        
        // Mark the start of the sublist to be reversed
        ListNode sublisthead = curr;
        
        // Initialize pointers to reverse the sublist
        ListNode prevnode = null;
        ListNode next;

        // Reverse the sublist from left to right
        for (int i = 1; i <= right - left + 1; i++) {
            next = curr.next;
            curr.next = prevnode;
            prevnode = curr;
            curr = next;
        }
        
        // Connect the reversed sublist with the previous part
        prev.next = prevnode;
        
        // Connect the end of the reversed sublist to the next part of the list
        sublisthead.next = curr;

        // Return the new head of the list
        return dummy.next;
    }
}
