class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> ans= new ArrayList<>();
    List<Integer> ll= new ArrayList<>();
    Arrays.sort(nums);
    hello(nums,0,ans,ll);
    return ans;
    }
    public static void hello(int [] nums,int index,List<List<Integer>>ans,List<Integer>ll){
    ans.add(new ArrayList<>(ll));
    for (int i=index;i<nums.length;i++){
        if (i!=index && nums[i]==nums[i-1] ){
            continue;
        }
        ll.add(nums[i]);
    hello(nums,i+1,ans,ll);
    ll.remove(ll.size()-1);
    }
    }   
}