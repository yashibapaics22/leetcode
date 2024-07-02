// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     TreeNode first;
//     TreeNode second;
//     TreeNode last;
//     TreeNode prev;
//     public void recoverTree(TreeNode root) {
//         first=second=last=null;
//         prev=new TreeNode (Integer.MIN_VALUE);
//         inorder(root);
//         if (first!=null && second!=null){
//             int temp=first.val;
//             first.val= second.val;
//             second.val=temp;
//         }
//         else if (first!=null && last!=null){
//             int temp1=first.val;
//             first.val=last.val;
//             last.val=temp1;
//         }
//     }
//     public void inorder(TreeNode root){
//         if (root==null)
//         return;
//         inorder(root.left);
//         if(prev!=null && prev.val>root.val){
//             if (first==null){
//              first=prev;
//              second=root;
//         }
//         else{
//              last=root;
//         }
//     }
//              prev=root;
//         inorder(root.right);
//     }
// }
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
    TreeNode first;
    TreeNode second;
    TreeNode prev;

    public void recoverTree(TreeNode root) {
        first = second = null;
        prev = new TreeNode(Integer.MIN_VALUE);
        inorder(root);
        if (first != null && second != null) {
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }
    }

    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        if (prev != null && prev.val > root.val) {
            if (first == null) {
                first = prev;
                second = root;
            } else {
                second = root;
            }
        }
        prev = root;
        inorder(root.right);
    }
}
