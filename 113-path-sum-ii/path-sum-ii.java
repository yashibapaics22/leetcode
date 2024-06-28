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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
      List<List<Integer>> ans= new ArrayList<>();
      return sum(root,targetSum,ans,0,new ArrayList<>());  
    }
    public static List<List<Integer>> sum(TreeNode root, int target,List<List<Integer>>ans,int sum 
    ,List<Integer>ll){
         if (root==null)
         return ans;
         ll.add(root.val);
         sum+=root.val;
         if (root.left==null && root.right==null && sum==target)
         ans.add(new ArrayList<>(ll));
         sum(root.left,target,ans,sum,ll);
         sum(root.right,target,ans,sum,ll);
         ll.remove(ll.size()-1);
         return ans;
    }
}