import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;

        // Traverse the entire grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // If the cell is land ('1') and not visited, start BFS
                if (grid[i][j] == '1') {
                    bfs(i, j,n,m , grid); // Perform BFS
                    count++;
                }
            }
        }
        return count;
    }

    public void bfs(int i, int j,int row,int col, char[][] grid) {
        if (i<0 || j<0 || i>=row || j>=col || grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        bfs(i+1,j,row,col,grid);
        bfs(i-1,j,row,col,grid);
        bfs(i,j-1,row,col,grid);
        bfs(i,j+1,row,col,grid);
    }
}
