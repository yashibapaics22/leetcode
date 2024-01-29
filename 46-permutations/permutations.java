class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean [] freq=new boolean [nums.length];
        permutation(nums,new ArrayList<>(),ans,freq);
        return ans;
    }
    public static void permutation(int []nums,List<Integer>ll,List<List<Integer>>ans,boolean [] freq){
        if (ll.size()==nums.length){
         ans.add(new ArrayList<>(ll));
         return;
        }
        for (int i=0;i<nums.length;i++){
            if (!freq[i]){
            freq[i]=true;
            ll.add(nums[i]);
            permutation(nums,ll,ans,freq);
            ll.remove(ll.size()-1);
            freq[i]=false;
            }
        }
    }
}