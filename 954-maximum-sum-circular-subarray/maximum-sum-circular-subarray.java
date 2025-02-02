class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSum = Integer.MIN_VALUE, currMax = 0;
        int minSum = Integer.MAX_VALUE, currMin = 0;
        for (int num : nums) {
            totalSum += num;
            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);
            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);
        }
        return (maxSum > 0)?Math.max(maxSum, totalSum - minSum):maxSum;
    }
}