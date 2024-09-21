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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }
        
        // Trim the left and right subtrees first
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        
        // If the current node's value is less than 'low', discard left subtree
        if (root.val < low) {
            return root.right;
        }
        
        // If the current node's value is greater than 'high', discard right subtree
        if (root.val > high) {
            return root.left;
        }
        
        // If within the range, return the current root
        return root;
    }
}
