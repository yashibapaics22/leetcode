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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        List<List<Integer>> ans= new ArrayList<>();
        if (root!=null)
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> ll= new ArrayList<>();
            for (int i=0;i<size;i++){
                TreeNode temp= q.poll();
                ll.add(temp.val);
                if (temp.left!=null)
                q.add(temp.left);
                if (temp.right!=null)
                q.add(temp.right);
            }
            ans.add(ll);
        }
        Collections.reverse(ans);
        return ans;
    }
}