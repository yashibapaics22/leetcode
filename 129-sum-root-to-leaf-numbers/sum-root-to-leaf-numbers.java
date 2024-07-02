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
        sum(root,sum,"");
        return sum[0];
    }
    public static void sum(TreeNode root,int [] sum,String str){
        if (root==null)
        return ;
        str=str+root.val;
        if (root.left==null && root.right==null){
            sum[0]=sum[0]+Integer.parseInt(str);
        }
        sum(root.left,sum,str);
        sum(root.right,sum,str);
    }
}