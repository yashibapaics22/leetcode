class Solution {
    public int minimumDeletions(String s) {
         int count=0;
         int ans=0;
         for(char i:s.toCharArray())
         {
            if(i=='b')
            count++;
            else if(count>0)
            {
                count--;
                ans++;
            }
         }
         return ans;  
    }
}