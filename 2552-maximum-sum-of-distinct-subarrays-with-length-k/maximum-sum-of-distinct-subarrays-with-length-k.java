class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long currentSum = 0; 
        HashSet<Integer> set = new HashSet<>();
        int right = 0;
         for (int left = 0; left < nums.length; left++) {
             while (right < nums.length && !set.contains(nums[right]) && set.size() < k) {
                 set.add(nums[right]);
                 currentSum += nums[right];
                 right++;
             }

            if (set.size() == k) {
                maxSum = Math.max(currentSum, maxSum);
            }
             set.remove(nums[left]);
             currentSum -= nums[left];
        }

        return maxSum;
    }
}