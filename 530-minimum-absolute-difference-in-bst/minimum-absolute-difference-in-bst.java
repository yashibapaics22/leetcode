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
    public int getMinimumDifference(TreeNode root) {
         List<Integer> ll= new ArrayList<>();
        int diff=Integer.MAX_VALUE;
        inorder(root,ll);
        for (int i=0;i<ll.size()-1;i++){
            int n=ll.get(i);
            int m=ll.get(i+1);
            diff=Math.min(diff,m-n);
        }
        return diff;
    }
    public void inorder(TreeNode root,List<Integer>ll){
        if (root==null){
            return;
        }
        inorder(root.left,ll);
        ll.add(root.val);
        inorder(root.right,ll); 
    }
}