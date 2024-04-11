class Solution {
    public int monotoneIncreasingDigits(int n) {
        char arr[] = String.valueOf(n).toCharArray();

        int x = arr.length;
        int st = x;
        
        for(int i=x-2; i>=0; i--){
            if(arr[i]>arr[i+1]){
                st = i+1;
                arr[i]--;
            }
        }

        for(int i=st; i<x; i++){
            arr[i] = '9';
        }

        return Integer.valueOf(String.valueOf(arr));
    }
}