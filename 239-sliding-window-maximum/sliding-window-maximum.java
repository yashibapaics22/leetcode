import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        return slidingwindow(nums, k);
    }
    
    public static int[] slidingwindow(int[] arr, int k) {
        if (arr == null || arr.length == 0) return new int[0];
        
        int[] ans = new int[arr.length - k + 1];
        Deque<Integer> q = new LinkedList<>();
        
        for (int i = 0; i < k; i++) {
            while (!q.isEmpty() && arr[q.getLast()] < arr[i]) {
                q.removeLast();
            }
            q.add(i);
        }
        
        ans[0] = arr[q.getFirst()];
        
        for (int i = k; i < arr.length; i++) {
            while (!q.isEmpty() && q.getFirst() <= i - k) {
                q.removeFirst();
            }
            
            while (!q.isEmpty() && arr[q.getLast()] < arr[i]) {
                q.removeLast();
            }
            q.add(i);
            
            ans[i - k + 1] = arr[q.getFirst()];
        }
        
        return ans;
    }
}
