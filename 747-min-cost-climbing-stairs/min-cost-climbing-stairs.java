import java.util.Arrays;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        Arrays.fill(dp, -1);
        // Compute the minimum cost to reach the top starting from step 0 or step 1
        return Math.min(min(cost, 0, dp), min(cost, 1, dp));
    }

    public static int min(int[] nums, int index, int[] dp) {
        if (index >= nums.length)
            return 0;
        if (dp[index] != -1)
            return dp[index];
        int count = nums[index] + min(nums, index + 2, dp);
        int not_count = nums[index] + min(nums, index + 1, dp);
        return dp[index] = Math.min(count, not_count);
    }
}
