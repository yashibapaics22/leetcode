class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ll= new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        hello(nums,0,ans,ll);
        return ans;
    }
    public static void hello(int [] nums,int index,List<List<Integer>>ans,List<Integer>ll){
        ans.add(new ArrayList<>(ll));
        for (int i=index;i<nums.length;i++){
            ll.add(nums[i]);
           hello(nums,i+1,ans,ll) ;
            ll.remove(ll.size()-1);
        }
    }
}