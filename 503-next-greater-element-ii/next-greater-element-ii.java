class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] arr= new int [nums.length];
        Stack<Integer> st= new Stack<>();
     for (int i=0;i<2*nums.length-1;i++){
        while(!st.isEmpty() && nums[st.peek()]<nums[i%nums.length]){
            arr[st.pop()]= nums[i%nums.length];
        }
        if (i<nums.length)
        st.push(i);
     }  
     while(!st.isEmpty()){
        arr[st.pop()]=-1;
     } 
     return arr;
    }
}