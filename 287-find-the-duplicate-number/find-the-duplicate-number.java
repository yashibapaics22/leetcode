class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return num;  // Found the duplicate
            } else {
                set.add(num);
            }
        }

        // No duplicate found
        return -1;
    }
}