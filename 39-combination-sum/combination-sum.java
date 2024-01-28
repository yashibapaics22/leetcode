class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ll= new ArrayList<>();
        combinations(0,candidates,target,ll,new ArrayList<>());
        return ll;
    }
    public static void combinations(int index,int []nums,int target,List<List<Integer>>ll,List<Integer>ans){
        if (index==nums.length){
            if (target==0){
            ll.add(new ArrayList(ans));
            }
            return;
        }
        if (nums[index]<=target){
        ans.add(nums[index]);
        combinations(index,nums,target-nums[index],ll,ans);
        ans.remove(ans.size()-1);
        }
        combinations(index+1,nums,target,ll,ans);
    }
}