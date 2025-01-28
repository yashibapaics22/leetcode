class Solution {
    public int findMaxFish(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int k=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (grid[i][j]!=0)
                k=Math.max(k,bfs(i,j,n,m,grid));
            }
        }
        return k;
    }
    public static int bfs(int i,int j,int n,int m,int [][]grid){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0){
            return 0;
        }
        int curr=grid[i][j];
        grid[i][j]=0;
        return curr+bfs(i+1,j,n,m,grid)+bfs(i,j+1,n,m,grid)+ bfs(i-1,j,n,m,grid)+
        bfs(i,j-1,n,m,grid);
    }
}