class Solution {
    public int change(int amount, int[] coins) {
        int [][] dp= new int [amount+1][coins.length];
        for (int []i:dp){
            Arrays.fill(i,-1);
        }
        return coinchange(amount,0,coins,dp);
    }
    public int coinchange(int target,int index,int []coins,int [] []dp){
       if (target==0)
       return 1;
       if (index>=coins.length)
       return 0;
       if (dp[target][index]!=-1)
       return dp[target][index];
       int choose=0;
       int not_choose=0;
       if (coins[index]<=target)
       choose=coinchange(target-coins[index],index,coins,dp);
       not_choose=coinchange(target,index+1,coins,dp);
       return dp[target][index]=choose+not_choose;
    }
}