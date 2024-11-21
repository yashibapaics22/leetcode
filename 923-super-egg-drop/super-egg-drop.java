class Solution {
    public int superEggDrop(int k, int n) {
        int [][]dp = new int [n+1][k+1];
        for (int [] a:dp){
            Arrays.fill(a,-1);
        }
        return Egg_Drop(n,k,dp);
    }
     public static int Egg_Drop(int n,int e,int [][]dp){
        if (n==0 ||n==1 || e==1){
            return n;
        }
        if (dp[n][e]!=-1){
            return dp[n][e];
        }
        int ans=Integer.MAX_VALUE;
        int lo=1;
        int hi=n;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int left=Egg_Drop(mid-1,e-1,dp);
            int right=Egg_Drop(n-mid,e,dp);
            int t=Math.max(left,right)+1;
            ans=Math.min(ans,t);
            if (left<right){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return dp[n][e]=ans;
    }
}