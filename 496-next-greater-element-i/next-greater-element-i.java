class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     int [] arr= new int [nums1.length];
     Stack <Integer> st= new Stack<>();
      Map<Integer,Integer> map= new HashMap<>();
      for (int i=0;i<nums2.length;i++){
        map.put(nums2[i],-1);
      } 
      for (int i=0;i<nums2.length;i++){
        while(!st.isEmpty() && nums2[i]>st.peek()){
            map.put(st.peek(),nums2[i]);
            st.pop();
        }
        st.push(nums2[i]);
      }
      int j=0;
      for (int i:nums1){
        arr[j]=map.getOrDefault(i,-1);
        j++;
      }
      return arr;
    }
}