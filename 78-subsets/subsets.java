class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        bt(ans, new ArrayList<>(), nums, 0);
        return ans;
    }
    public void bt(List<List<Integer>> ans, ArrayList<Integer> a, int[] nums, int idx) {
        ans.add(new ArrayList(a));
        for (int i = idx; i < nums.length; i++) {
            a.add(nums[i]);
            bt(ans, a, nums, i + 1);
            a.remove(a.size() - 1);
        }
    }
}