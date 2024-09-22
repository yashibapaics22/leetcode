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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        boolean iseven=true;
        while(!q.isEmpty()){
            int size=q.size();
            int prevalue = iseven ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for (int i=0;i<size;i++){
                TreeNode temp=q.poll();
                int currvalue=temp.val;
                if (iseven){
                   if (currvalue%2==0 || currvalue<=prevalue){
                       return false;
                   }
                }
                else{
                    if (currvalue%2!=0 || currvalue>=prevalue){
                        return false;
                    }
                }
                prevalue=currvalue;
                if (temp.left!=null){
                    q.add(temp.left);
                }
                if (temp.right!=null){
                    q.add(temp.right);
                }
            }
            iseven=!iseven;
        }
        return true;
    }
}