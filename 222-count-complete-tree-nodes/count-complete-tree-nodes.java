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
    public int countNodes(TreeNode root) {
       int k=count(root);
       return k;
    }
    public static int count(TreeNode root){
        if (root==null)
           return 0;
        int left= count(root.left);
        int right= count(root.right);
        return left+right+1;
    }
}