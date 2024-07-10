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
    public TreeNode sortedArrayToBST(int[] nums) {
        return node(nums,0,nums.length-1);
    }
    public static TreeNode node(int [] nums,int start,int end){
        if (start>end)
        return null;
        int mid=(start+end)/2;
        TreeNode root= new TreeNode(nums[mid]);
        root.left= node(nums,start,mid-1);
        root.right=node(nums,mid+1,end);
        return root;
    }
}