class Solution {
    public List<Integer> majorityElement(int[] nums) {
    ArrayList<Integer> ll = new ArrayList<>();
      int n= nums.length;
      int count1=0;
      int count2=0;
      int element1=0;
      int element2=0;
      for (int i=0;i<n;i++){
        if (count1==0 && element2!=nums[i]){
            count1=1;
            element1=nums[i];
        }
        else if (count2==0 && element1!=nums[i]){
            count2=1;
            element2=nums[i];
        }
        else if (element1==nums[i])
        count1++;
        else if (element2==nums[i])
        count2++;
        else{
            count1--;
            count2--;
        }
      }
      int counta=0;
      int countb=0;
      for (int i=0;i<n;i++){
        if (nums[i]==element1)
        counta++;
      }
      for (int i=0;i<n;i++){
        if (nums[i]==element2)
        countb++;
      }
      if (counta>n/3)
      ll.add(element1);
      if (countb>n/3 && element1!=element2)
      ll.add(element2);
      return ll;
    }
}