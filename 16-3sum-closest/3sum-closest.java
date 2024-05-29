class Solution {
    public int threeSumClosest(int[] nums, int target) {
     Arrays.sort(nums);
     int n= nums.length;
     int closest=Integer.MAX_VALUE;
     for (int i=0;i<n;i++){
        if (i!=0 && nums[i]== nums[i-1])
        continue;
        int j=i+1;
        int k=n-1;
        while(j<k){
            int sum= nums[i]+ nums[j]+ nums[k];
            if (Math.abs(target-sum)<Math.abs(target-closest))
            closest=sum;
            if (sum>target)
            k--;
            else
            j++;
        }
     }
     return closest;   
    }
}