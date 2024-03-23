class Solution {
    public int[] sortArray(int[] nums) {
    int n=nums.length;
    divide(nums,0,n-1);
    return nums;    
    }
    public static void divide(int []nums,int si,int ei){
    if (si>=ei){
        return;
    }
    int mid=si+(ei-si)/2;
    divide(nums,si,mid);
    divide(nums,mid+1,ei);
    conquer(nums,si,mid,ei);
    }
    public static void conquer(int []nums,int si,int mid,int ei){
        int []merged= new int [ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=ei){
            if (nums[idx1]<=nums[idx2]){
                merged[x++]=nums[idx1++];
            }
            else{
                merged[x++]=nums[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++]=nums[idx1++];
        }
        while(idx2<=ei){
            merged[x++]=nums[idx2++];
        }
        for (int i=0,j=si;i<merged.length;i++,j++){
            nums[j]=merged[i];
        }
    }
}