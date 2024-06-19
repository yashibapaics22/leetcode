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
    public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> ll= new ArrayList<>();
      return(inorder(root,ll));  
    }
    public static List<Integer> inorder (TreeNode root,List<Integer>ll){
        if (root==null)
        return ll;
        inorder(root.left,ll);
        ll.add(root.val);
        inorder(root.right,ll);
        return ll;
    }
}