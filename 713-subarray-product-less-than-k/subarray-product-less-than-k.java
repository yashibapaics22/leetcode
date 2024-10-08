class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return count(nums,k);
    }
    public static int count(int [] arr,int k){
        int si=0;
        int ei=0;
        int p=1;
        int ans=0;
        while(ei<arr.length){
            //window grow
            p=p*arr[ei];
            //window shrink
            while(p>=k && si<=ei){
                p=p / arr[si];
                si++;
            }
            //answer calculations
            ans= ans+ei-si+1;
            ei++;
        }
        return ans;
    }
}