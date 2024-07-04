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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       HashMap <Integer,Integer> map= new HashMap<>();
       for (int i=0;i<inorder.length;i++){
        map.put(inorder[i],i);
       } 
       return tree(inorder,0,inorder.length-1,postorder,0,postorder.length-1,map);
    }
    public static TreeNode tree(int [] inorder, int istart,int iend,int [] postorder,int pstart,int pend,HashMap<Integer,Integer>map){
        if (istart>iend || pstart>pend)
        return null;
        TreeNode root= new TreeNode (postorder[pend]);
        int iroot= map.get(postorder[pend]);
        int left=iroot-istart;
        root.left=tree(inorder,istart,iroot-1,postorder,pstart,pstart+left-1,map);
        root.right=tree(inorder,iroot+1,iend,postorder,pstart+left,pend-1,map);
        return root;
    }
}