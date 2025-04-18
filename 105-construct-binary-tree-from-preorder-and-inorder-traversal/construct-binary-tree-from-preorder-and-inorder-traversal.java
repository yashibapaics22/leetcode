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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return tree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
    }
    public static TreeNode tree(int []preorder,int pstart,int pend,int [] inorder,int istart,int iend,HashMap<Integer,Integer> map){
        if(pstart>pend)
        return null;
        int rootval=preorder[pstart];
        TreeNode root= new TreeNode (rootval);
        int mid=map.get(root.val);
        int leftsize=mid-istart;
        root.left=tree(preorder,pstart+1,pstart+leftsize,inorder,istart,mid-1,map);
        root.right=tree(preorder,pstart+leftsize+1,pend,inorder,mid+1,iend,map);
        return root;
    }
}