class Solution {
    public int longestMountain(int[] arr) {
   int largest = 0;
   int n=arr.length;
    
        if (n < 3) {
            System.out.println(0);
            return 0;
        }
    
        for (int i = 1; i < n - 1; i++) {
            // Check if arr[i] is a peak
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                int count = 1;
                int j = i;
    
                // Move left from the peak
                while (j > 0 && arr[j] > arr[j - 1]) {
                    count++;
                    j--;
                }
    
                // Move right from the peak
                while (i < n - 1 && arr[i] > arr[i + 1]) {
                    count++;
                    i++;
                }
    
                // Update largest mountain size found
                if (count > largest) {
                    largest = count;
                }
            }
        }
    
        return largest;    
}
}
