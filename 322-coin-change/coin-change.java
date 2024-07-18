import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[amount + 1][coins.length];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int result = change(amount, coins, dp, 0);
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    public int change(int target, int[] coins, int[][] dp, int index) {
        if (target == 0) return 0;
        if (index >= coins.length || target < 0) return Integer.MAX_VALUE;
        if (dp[target][index] != -1) return dp[target][index];

        int include = Integer.MAX_VALUE;
        if (coins[index] <= target) {
            int res = change(target - coins[index], coins, dp, index);
            if (res != Integer.MAX_VALUE) {
                include = res + 1;
            }
        }
        int exclude = change(target, coins, dp, index + 1);

        dp[target][index] = Math.min(include, exclude);
        return dp[target][index];
    }
}
