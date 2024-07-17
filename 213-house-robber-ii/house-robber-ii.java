class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) 
        return nums[0];
       int[] dp1=new int [nums.length];
       Arrays.fill(dp1,-1);
       int[] dp2=new int [nums.length];
       Arrays.fill(dp2,-1);
       return Math.max(max(nums,0,nums.length-2,dp1),max(nums,1,nums.length-1,dp2)); 
    }
    public static int max(int [] nums,int index,int end,int []dp){
        if(index>end)
        return 0;
        if (dp[index]!=-1)
        return dp[index];
        int count= nums[index]+max(nums,index+2,end,dp);
        int not_count= max(nums,index+1,end,dp);
        return dp[index]=Math.max(count,not_count);
    }
}