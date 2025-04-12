class Solution {
    public int lengthOfLIS(int[] nums) {
        return LIS(nums);
    }
    public static int LIS(int [] nums){
        int [] lis= new int [nums.length];
        Arrays.fill(lis,1);
        for (int i=0;i<nums.length;i++){
            for (int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                    int x=lis[j];
                    lis[i]=Math.max(lis[i],x+1);
                }
            }
        }
        int max=0;
        for (int i=0;i<lis.length;i++){
            max=Math.max(max,lis[i]);
        }
        return max;
    }
}