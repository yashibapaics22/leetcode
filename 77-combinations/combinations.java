class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        hello(n, k, 1, ll, ans);
        return ans;
    }
    public void hello(int n, int k, int start, List<Integer> ll, List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(ll));
            return;
        }

        for (int i = start; i <= n - k + 1; i++) {
            ll.add(i);
            hello(n, k - 1, i + 1, ll, result);
            ll.remove(ll.size() - 1);
        }
    }
}