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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> llP = new ArrayList<>();
        List<Integer> llQ = new ArrayList<>();
        return same(p, llP).equals(same(q, llQ));
    }
    public static List<Integer> same (TreeNode node,List<Integer>ll){
        if (node==null){
            ll.add(null);
            return ll;
        }
        ll.add(node.val);
        same(node.left,ll);
        same(node.right,ll);
        return ll;
    }
}