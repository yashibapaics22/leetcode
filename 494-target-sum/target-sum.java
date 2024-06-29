class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return sum(nums, target, 0, 0);
    }

    public int sum(int[] nums, int target, int sum, int index) {
        if (index == nums.length) {
            return sum == target ? 1 : 0;
        }
        return sum(nums, target, sum + nums[index], index + 1) + sum(nums, target, sum - nums[index], index + 1);
    }
}
