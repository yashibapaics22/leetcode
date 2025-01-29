class Solution {
    public int closedIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (grid[i][j]==0 && dfs(i,j,n,m,grid)){
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean dfs(int i,int j,int n,int m,int [][]grid){
        if (i<0 || j<0 || i>=n || j>=m ){
            return false;
        }
        if (grid[i][j]==1){
            return true;
        }
        grid[i][j]=1;
        boolean left= dfs(i-1,j,n,m,grid);
        boolean right= dfs(i+1,j,n,m,grid);
        boolean up= dfs(i,j-1,n,m,grid);
        boolean down= dfs(i,j+1,n,m,grid);
        return left && right && up && down;
    }
}