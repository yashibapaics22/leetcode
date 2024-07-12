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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (head == null) return true;
        if (root == null) return false;
        
        // Check if the path starts from the current root node or any of its children
        return isPath(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    private boolean isPath(ListNode head, TreeNode root) {
        if (head == null) return true;
        if (root == null) return false;
        
        // Check if the current nodes match and continue checking the next nodes in both the linked list and the tree
        return head.val == root.val && (isPath(head.next, root.left) || isPath(head.next, root.right));
    }
}
