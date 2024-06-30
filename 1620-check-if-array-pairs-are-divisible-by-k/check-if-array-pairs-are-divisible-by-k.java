class Solution {
    public boolean canArrange(int[] arr, int k) {
      Map<Integer,Integer> map=new HashMap<>();
      for (int i: arr){
        int rem=i%k;
        if (rem<0)
        rem+=k;
        map.put(rem,map.getOrDefault(rem,0)+1);
      } 
      if (map.containsKey(0) && map.get(0)%2!=0)
      return false;
      if (map.containsKey(0))
      map.remove(0);
      for (int j:map.keySet()){
        int rem=j;
        int a=map.getOrDefault(k-rem,0);
        int b=map.get(rem);
        if (a!=b)
        return false;
      }
      return true;
    }
}
