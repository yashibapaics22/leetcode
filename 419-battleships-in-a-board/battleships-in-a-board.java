class Solution {
    public int countBattleships(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        int count=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (board[i][j]=='X'){
                    bfs(i,j,n,m,board);
                    count++;
                }
            }
        }
        return count;
    }
    public static void bfs(int i,int j,int n,int m,char [][] grid){
        if (i<0 || j<0 || i>=n || j>=m || grid[i][j]=='.'){
            return;
        }
        grid[i][j]='.';
        bfs(i + 1, j, n, m, grid);
        bfs(i, j + 1, n, m, grid);
        bfs(i - 1, j, n, m, grid);
        bfs(i, j - 1, n, m, grid);
    }
}