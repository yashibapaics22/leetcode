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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ll= new ArrayList<>();
        find (root,ll,"");
        return ll;
    }
    public void find(TreeNode root,List<String>ll,String str){
        if (root==null){
            return;
        }
        if (root.left==null && root.right==null){
            ll.add(str+root.val);
            return;
        }
        find(root.left,ll,str+root.val+"->");
        find(root.right,ll,str+root.val+"->");
    }
}