class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
      String s="123456789";
      List<Integer> ll= new ArrayList<>();
      int nl=String.valueOf(low).length();
      int nh=String.valueOf(high).length();
      for (int i=nl;i<=nh;i++){
         for (int j=0;j<10-i;j++){
             int num= Integer.parseInt(s.substring(j,j+i));
             if (num>=low && num<=high)
             ll.add(num);
         }
      }
      return ll;  
    }
}