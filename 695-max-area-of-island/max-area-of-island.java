class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int area=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (grid[i][j]==1){
                area=Math.max(area,dfs(i,j,n,m,grid));
                }
            }
        }
        return area;
    }
    public static int dfs(int i,int j,int n,int m,int [][]grid){
        if (i<0 || j<0 || i>=n || j>=m ||grid[i][j]==0){
            return 0;
        }
        int area=1;   //for initial block
        grid[i][j]=0;
        return area+dfs(i+1,j,n,m,grid)+dfs(i,j+1,n,m,grid)+dfs(i-1,j,n,m,grid)+
        dfs(i,j-1,n,m,grid);
    }
}