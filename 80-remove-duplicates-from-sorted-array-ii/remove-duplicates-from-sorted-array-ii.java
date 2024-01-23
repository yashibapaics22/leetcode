class Solution {
    public int removeDuplicates(int[] nums) {
        int c=1;
        int counter=1;
        for (int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
            counter++;
            }
            else
            counter=1;
            if (counter<=2){
                nums[c]=nums[i];
                c++;
            }
        }
        return c;
    }
}