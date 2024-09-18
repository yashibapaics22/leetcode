class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    //frequency map is designed
    HashMap<Integer,Integer> map= new HashMap<>();      
    for (int i=0;i<nums1.length;i++){
       if (!map.containsKey(nums1[i])){
        map.put(nums1[i],1);
       }
       else{
        map.put(nums1[i],map.get(nums1[i])+1);
       }
    }  
    List<Integer> ll= new ArrayList<>();
    for (int i=0;i<nums2.length;i++){
        if (map.containsKey(nums2[i]) && map.get(nums2[i])>0) {       //order cannot be reversed
           ll.add(nums2[i]);
           map.put(nums2[i],map.get(nums2[i])-1);
        }   
    }  
    int [] arr= new int [ll.size()];
    for (int i=0;i<ll.size();i++){
        arr[i]=ll.get(i);
    } 
    return arr;
    }
}