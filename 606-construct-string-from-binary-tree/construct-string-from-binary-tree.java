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
    public String tree2str(TreeNode root) {
        StringBuilder str= new StringBuilder();
        sum(root,str);
        return str.toString();
    }
    public void sum(TreeNode root ,StringBuilder str){
        if (root==null)
        return;
        str.append(root.val);
        if (root.left!=null){
            str.append('(');
            sum(root.left,str);
            str.append(')');
        }
        if (root.right!=null){
            if (root.left==null)
            str.append("()");
            str.append('(');
            sum(root.right,str);
            str.append(')');
        }
    }
}