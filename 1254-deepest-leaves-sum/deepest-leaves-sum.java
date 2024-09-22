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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        int sum=0;
        while(!q.isEmpty()){
            int size=q.size();
            sum=0;
            for (int i=0;i<size;i++){
                TreeNode temp=q.poll();
                sum=sum+temp.val;
                if (temp.left!=null){
                    q.add(temp.left);
                }
                if (temp.right!=null){
                    q.add(temp.right);
                }
            }
        }
        return sum;
    }
}