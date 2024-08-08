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
    int ans=0;
    public int pathSum(TreeNode root,int targetSum){
        return path(root,targetSum);
    }
    public int path(TreeNode root, long targetSum) {
        if (root==null){
            return 0;
        }
        int c= countpath(root,targetSum);
        int l= path(root.left,targetSum);
        int r= path(root.right,targetSum);
        return l+c+r;
    }
    public int countpath(TreeNode root, long targetSum){
        if (root==null){
            return 0;
        }
        int count=0;
        if (root.val-targetSum==0){
            count++;
        }
        int left= countpath(root.left,targetSum-root.val);
        int right= countpath(root.right,targetSum-root.val);
        return left+right+count;
    }
}