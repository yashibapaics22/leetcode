class Solution {
    private int  ans=0;
    public int findTargetSumWays(int[] nums, int target)
    {
        find(nums,target,0,0);

        return ans;


    }
    private  void find(int nums[],int t,int index,int sum)
    {
        if(index==nums.length)
        {
            if(sum==t)
            ans++;

            return ;
        }
        find(nums,t,index+1,sum+nums[index]);
          find(nums,t,index+1,sum-nums[index]);



    }
}