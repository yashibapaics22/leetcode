class Solution {
    public int rob(int[] nums) {
        int []dp=new int [nums.length];
        Arrays.fill(dp,-1);
        return robber(nums,0,dp);
    }
    public static int robber(int [] arr,int i,int []dp){
        if (i>=arr.length){
            return 0;
        }
        if (dp[i]!=-1){
            return dp[i];
        }
        int rob=arr[i]+robber(arr,i+2,dp);
        int dontrob=robber(arr,i+1,dp);
        return dp[i]=Math.max(rob,dontrob);
    }
}