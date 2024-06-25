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
    public boolean isValidBST(TreeNode root) {
        TreeNode [] prev= new TreeNode [1];
        return inorder(root,prev);
    }
    public static boolean inorder(TreeNode root, TreeNode []prev){
       if (root == null)
            return true;
        if (!inorder(root.left, prev))
            return false;
        if (prev[0] != null && root.val <= prev[0].val)
            return false;
        prev[0] = root;
        return inorder(root.right, prev);
    }
}