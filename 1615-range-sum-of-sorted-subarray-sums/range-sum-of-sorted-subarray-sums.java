class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> subarraySums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                subarraySums.add(sum);
            }
        }
        Collections.sort(subarraySums);
        int result = 0;
        for (int i = left - 1; i <= right - 1; i++) {
            result = (result+ subarraySums.get(i)) % (int)(Math.pow(10,9)+7);
        }
        return result ;
    }
}