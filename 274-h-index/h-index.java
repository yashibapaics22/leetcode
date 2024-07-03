class Solution {
    public int hIndex(int[] nums) {
       Arrays.sort(nums);
       int ans=0;
       int low=1;
       int high=nums.length;
       while(low<=high){
          int mid=(low+high) /2;
          if (ispossible(nums,mid)){
            ans=mid;
            low=mid+1;
          }
          else{
            high=mid-1;
          }
       } 
       return ans;
    }
    public static boolean ispossible(int [] nums,int mid){
        for (int i=0;i<nums.length;i++){
            if (nums[i]>=mid){
                if ((nums.length-i)>=mid)
                return true;
            }
        }
        return false;
    }
}