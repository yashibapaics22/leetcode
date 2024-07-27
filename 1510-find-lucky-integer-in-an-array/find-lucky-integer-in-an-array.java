class Solution {
    public int findLucky(int[] arr) {
        int []freq= new int [arr.length+1];
        for (int num:arr){
            if (num>=1 && num<=arr.length){
                freq[num]++;
            }
        }
        int max=-1;
        for (int i=1;i<=arr.length;i++){
            if (freq[i]==i)
            max=Math.max(max,i);
        }
        return max;
    }
}