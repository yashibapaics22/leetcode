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
    String total;
    public String smallestFromLeaf(TreeNode root) {
        total="~";
        small(root,"");
        return total;
    }
    public void small(TreeNode root,String str){
        if (root==null)
        return;
        str=(char)(root.val+'a')+str;
        if(root.left==null && root.right==null){
            if (str.compareTo(total)<0)
            total=str;
        }
        small(root.left,str);
        small(root.right,str);
    }
}