class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int [] ans= new int [2];
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }
        int index=0;
        for (Map.Entry<Integer,Integer> i:mp.entrySet()){
            if(i.getValue()==2){
                ans[index++]=i.getKey();
            }
        }
        return ans;
    }
}