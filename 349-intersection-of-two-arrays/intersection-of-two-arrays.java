class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     HashSet <Integer> set1= new HashSet<>();
     HashSet <Integer> set2= new HashSet<>();
     for (int num1:nums1){
        set1.add(num1);
     }
     for (int num2:nums2){
        if (set1.contains(num2))
        set2.add(num2);
     }
     int [] arr= new int [set2.size()];
     int c=0;
     for (int i:set2){
        arr[c]=i;
        c++;
     }
     return arr;
    }
}