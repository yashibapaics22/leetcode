class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count1=1;
        int count2=1;
        int ans=1;
        for (int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                count1++;
                count2=1;
            }
            else if (nums[i]>nums[i-1]){
                count2++;
                count1=1;
            }
            else{
                count1=1;
                count2=1;
            }
            ans=Math.max(ans,Math.max(count1,count2));
        }
        return ans;
    }
}