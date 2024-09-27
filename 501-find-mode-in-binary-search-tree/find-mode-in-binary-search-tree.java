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
    int max=1;
    public int[] findMode(TreeNode root) {
      HashMap<Integer,Integer> map= new HashMap<>();
      List<Integer> ll= new ArrayList<>();
      search(root,map);  
      for (int i:map.keySet()){
         if (map.get(i)==max){
            ll.add(i);
         }
      }
      int [] ans= new int [ll.size()];
      for (int i=0;i<ll.size();i++){
        ans[i]=ll.get(i);
      }
      return ans;
    }
    public void search(TreeNode root, HashMap<Integer,Integer>map){
        if (root==null){
            return;
        }
        else if(map.containsKey(root.val)){
            int count=map.get(root.val)+1;
            map.put(root.val,count);
            max=Math.max(count,max);
        }
        else{
            map.put(root.val,1);
        }
        search(root.left,map);
        search(root.right,map);
    }
}