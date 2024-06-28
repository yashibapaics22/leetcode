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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        int []max= new int [1];
        max[0]=Integer.MIN_VALUE;
        int []minlevel=new int [1];
        minlevel[0]=1;
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int size= q.size();
            int sum=0;
            for (int i=0;i<size;i++){
                TreeNode temp=q.poll();
                sum=sum+temp.val;
                if (temp.left!=null)
                q.add(temp.left);
                if (temp.right!=null)
                q.add(temp.right);
            }
            if (sum>max[0]){
                max[0]=sum;
                minlevel[0]=level;
            }
            level++;
        }
        return minlevel[0]+1;
    }
}