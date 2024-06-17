class Solution {
    public int countTriplets(int[] nums) {
    int temp = 1 << 16;
        int[] count = new int[65535];
        for (int num : nums) {
            for (int n : nums) {
                count[num & n]++;
            }
        }
        int res = 0;
        for (int num : nums) {
            for (int i = 0; i < 65535; i++) {
                if ((num & i) == 0) {
                    res += count[i];
                }
            }
        }
        return res;    
    }
}