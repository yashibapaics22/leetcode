class Solution {
    public int nextGreaterElement(int n) {
        char[] num = Integer.toString(n).toCharArray();
        int len = num.length;
        int d = -1;
        int d2 = -1;
        for (int i = len - 2; i >= 0; i--) {
            if (num[i] < num[i + 1]) {
                d = i;
                break;
            }
        }
        if (d == -1)
            return -1;
        for (int i = len - 1; i > d; i--) {
            if (num[i] > num[d]) {
                d2 = i;
                break;
            }
        }
        swap(num, d, d2);
        Arrays.sort(num, d + 1, num.length);
        long ans = Long.parseLong(new String(num));
        return (ans > Integer.MAX_VALUE) ? -1 : (int) ans;
    }
    public static void swap(char[] nums, int a, int b) {
        char temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}