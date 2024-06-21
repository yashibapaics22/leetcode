/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      ArrayList<TreeNode> ll1= new ArrayList<>();
      ArrayList<TreeNode> ll2= new ArrayList<>();
      path(root,p,ll1);
      path(root,q,ll2);  
      int i=0;
      while(i<ll1.size()&&i<ll2.size()){
        if (ll1.get(i)!=ll2.get(i))
        break;
        i++;
      }
      return ll1.get(i-1);
    }
    public static boolean path (TreeNode root, TreeNode n, ArrayList<TreeNode>ll){
      if (root==null)
      return false;
      ll.add(root);
      if (root==n)
      return true;
      boolean first= path(root.left,n,ll);
      boolean second= path(root.right,n,ll);
      if (first||second)
      return true;
      ll.remove(ll.size()-1);
      return false;
    }
}