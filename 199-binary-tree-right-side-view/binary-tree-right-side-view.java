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
    public List<Integer> rightSideView(TreeNode root) {
      Queue<TreeNode> q= new LinkedList<>();
      List<Integer> ll= new ArrayList<>();
      if (root==null)
      return ll;
      q.add(root);
      while(!q.isEmpty()){
        int size=q.size();
        for (int i=0;i<size;i++){
            TreeNode temp=q.poll();
            if (i==size-1)
            ll.add(temp.val);
            if (temp.left!=null)
            q.add(temp.left);
            if (temp.right!=null)
            q.add(temp.right);
        }
      } 
      return ll; 
    }
}