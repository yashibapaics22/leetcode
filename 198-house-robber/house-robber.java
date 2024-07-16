class Solution {
    public int rob(int[] nums) {
       int [] dp= new int [nums.length];
       Arrays.fill(dp,-1);
       return max(nums,0,dp); 
    }
    public static int max(int [] nums,int index,int []dp){
        if (index>=nums.length){
            return 0;
        }
        if (dp[index]!=-1){
            return dp[index];
        }
        int count=nums[index]+max(nums,index+2,dp);
        int not_count=max(nums,index+1,dp);
        return dp[index]=Math.max(count,not_count);
    }
}