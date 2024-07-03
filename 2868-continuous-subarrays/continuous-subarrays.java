class Solution {
    public long continuousSubarrays(int[] nums) {
      TreeMap<Integer,Integer> map= new TreeMap<>();
      int i=0;
      int j=0;
      long ans=0;
      while(i<nums.length){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        i++;
        while(Math.abs(map.firstEntry().getKey()-map.lastEntry().getKey())>2){
            map.put(nums[j],map.getOrDefault(nums[j],0)-1);
            if (map.get(nums[j])==0)
            map.remove(nums[j]);
            j++;
        }
        ans=ans+i-j;
      }  
      return ans;
    }
}