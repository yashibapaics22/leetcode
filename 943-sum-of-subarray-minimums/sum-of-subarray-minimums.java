class Solution {
    public int sumSubarrayMins(int[] arr) {
        int length = arr.length;
        int[] left = new int[length];
        int[] right = new int[length];
        Arrays.fill(left, -1);
        Arrays.fill(right, length);
        
        Stack<Integer> st = new Stack<>();
        
        // Fill left array
        for (int i = 0; i < length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                left[i] = st.peek();
            }
            st.push(i);
        }
        
        st.clear();
        
        // Fill right array
        for (int i = length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                right[i] = st.peek();
            }
            st.push(i);
        }
        
        int mod = (int) 1e9 + 7;
        long ans = 0;
        
        for (int i = 0; i < length; i++) {
            ans = (ans + (long) (i - left[i]) * (right[i] - i) % mod * arr[i] % mod) % mod;
        }
        
        return (int) ans;
    }
}
