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
    public int findSecondMinimumValue(TreeNode root) {
        return find(root,root.val);
    }
    public static int find(TreeNode root, int min){
        if (root==null){
            return -1;
        }
        if (root.val>min){
            return root.val;
        }
        int left=find(root.left,min);
        int right=find(root.right,min);

        if (left != -1 && right != -1) {
            return Math.min(left, right);
        }
        return Math.max(left, right);
    }
}