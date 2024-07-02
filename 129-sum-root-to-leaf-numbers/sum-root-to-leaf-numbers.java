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
    public int sumNumbers(TreeNode root) {
        int [] sum= new int [1];
        sum(root,sum,0);
        return sum[0];
    }
    public static void sum(TreeNode root,int [] sum,int s){
        if (root==null)
        return ;
        s=s*10+root.val;
        if (root.left==null && root.right==null){
            sum[0]=sum[0]+s;
        }
        sum(root.left,sum,s);
        sum(root.right,sum,s);
    }
}