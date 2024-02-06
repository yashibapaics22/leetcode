class Solution {
    public int repeatedStringMatch(String a, String b) {
        String s="";
        int count=0;
        for (int i=0;i<(b.length()/a.length())+2;i++){
            s=s+a;
            count++;
            if (s.contains(b))
            return count;
        }
        return -1;
    }
}