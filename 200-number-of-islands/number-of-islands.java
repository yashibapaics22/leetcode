import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m]; // Visited matrix to track visited cells
        int count = 0;

        // Traverse the entire grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // If the cell is land ('1') and not visited, start BFS
                if (grid[i][j] == '1' && visited[i][j] == 0) {
                    count++;
                    bfs(i, j, visited, grid); // Perform BFS
                }
            }
        }
        return count;
    }

    public void bfs(int row, int col, int[][] visited, char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        // Create a queue to store {row, col} positions
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{row, col}); // Add the starting cell
        visited[row][col] = 1; // Mark the starting cell as visited

        // Define row and column deltas for traversing 8 neighbors
        int[] delRow = {-1, 0, 1, 0}; // Up, Right, Down, Left
        int[] delCol = {0, 1, 0, -1};

        // BFS traversal
        while (!q.isEmpty()) {
            int[] current = q.poll(); // Get the current cell
            int currRow = current[0];
            int currCol = current[1];

            // Check all 4 neighbors
            for (int i = 0; i < 4; i++) {
                int nRow = currRow + delRow[i];
                int nCol = currCol + delCol[i];

                // Check if the neighbor is within bounds, is land ('1'), and not visited
                if (nRow >= 0 && nRow < n && nCol >= 0 && nCol < m &&
                        grid[nRow][nCol] == '1' && visited[nRow][nCol] == 0) {
                    visited[nRow][nCol] = 1; // Mark as visited
                    q.add(new int[]{nRow, nCol}); // Add the neighbor to the queue
                }
            }
        }
    }
}
