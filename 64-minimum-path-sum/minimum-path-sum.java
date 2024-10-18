class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int [][]dp= new int [m][n];
        return minimum(grid,dp,m-1,n-1);
    }
    public static int minimum (int [][]nums,int [][]dp,int m ,int n){
        if(m==0 && n==0){                
            return nums[m][n];
        }
        else if (m<0 || n<0){            //boundry condition
            return Integer.MAX_VALUE;
        }
        else if (dp[m][n]!=0){           //memoization
            return dp[m][n];
        }
        return dp[m][n]= nums[m][n]+ Math.min(minimum(nums,dp,m-1,n),minimum(nums,dp,m,n-1));
    }
}