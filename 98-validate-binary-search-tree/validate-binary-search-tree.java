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
       ArrayList<Integer> ll= new ArrayList<>();
       inorder(root,ll);
       for (int i=0;i<ll.size()-1;i++){
        if (ll.get(i)>=ll.get(i+1))
        return false;
       }
       return true;
    }
    public static void inorder(TreeNode root,ArrayList<Integer>ll){
        if (root==null)
        return;
        inorder(root.left,ll);
        ll.add(root.val);
        inorder(root.right,ll);
    }
}