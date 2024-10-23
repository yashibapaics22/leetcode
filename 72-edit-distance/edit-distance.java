class Solution {
    public int minDistance(String word1, String word2) {
       int [][] dp= new int [word1.length()][word2.length()];
        for (int []a: dp){
            Arrays.fill(a,-1);
        }
        return Min_Oprs(word1,word2,0,0,dp); 
    }
    public static int Min_Oprs(String s,String t, int i,int j,int [] [] dp){
        if (s.length()==i){
            return t.length()-j;
        }
        if (t.length()==j){
            return s.length()-i;
        }
        if (dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=0;
        if (s.charAt(i)==t.charAt(j)){
            ans=Min_Oprs(s,t,i+1,j+1,dp);
        }
        else{
            int d=Min_Oprs(s,t,i+1,j,dp);
            int r=Min_Oprs(s,t,i+1,j+1,dp);
            int in=Min_Oprs(s,t,i,j+1,dp);
            ans=Math.min(r,Math.min(d,in))+1;
        }
        return dp[i][j]=ans;
    }
}