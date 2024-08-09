class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= cols - 3; j++) {
                if (isMagicSquare(grid, i, j)) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isMagicSquare(int[][] grid, int row, int col) {
        int[] digits = new int[10];
        int sum = grid[row][col] + grid[row][col+1] + grid[row][col+2];
        
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < 3; j++) {
                int number = grid[row + i][col + j];
                if (number < 1 || number > 9 || digits[number] == 1) {
                    return false;
                }
                digits[number] = 1;
                rowSum += number;
                colSum += grid[row + j][col + i];
            }
            if (rowSum != sum || colSum != sum) {
                return false;
            }
        }

        // Check diagonals
        int diagonal1 = grid[row][col] + grid[row + 1][col + 1] + grid[row + 2][col + 2];
        int diagonal2 = grid[row][col + 2] + grid[row + 1][col + 1] + grid[row + 2][col];

        return diagonal1 == sum && diagonal2 == sum;
    }
}