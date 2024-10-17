class Solution {
    public int numDistinct(String s, String t) {
    int [][]dp= new int [s.length()][t.length()];
    for (int a[]:dp){
    Arrays.fill(a,-1);
    }
    return subsequence(s,t,0,0,dp);
    }
    public static int subsequence(String s,String t,int i,int j,int[][]dp){
        if (j==t.length()){
            return 1;
        }
        if (i==s.length()){
            return 0;
        }
        if (dp[i][j]!=-1){
            return dp[i][j];
        }
        int inc=0;                         //inclusion exclusion principle
        int exc=0;
        if (s.charAt(i)==t.charAt(j)){
            inc=subsequence(s,t,i+1,j+1,dp);
        }
        exc=subsequence(s,t,i+1,j,dp);
        return dp[i][j]=inc+exc;
    }
}