class Solution {
    public int magicalString(int n) {
    if (n<=0)
    return 0;
    if (n<=3)
    return 1;
    StringBuilder s= new StringBuilder("122");
    int ptr=2;
    int count=1;
    while(s.length()<n){
        int num=s.charAt(ptr)-'0';
        char toadd= (s.charAt(s.length()-1)=='1')?'2':'1';
        if (toadd=='1')
        count+=num;
        s.append(String.valueOf(toadd).repeat(num));
        ptr++;
    }
    for (int i = n; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count--;
            }
        }
    return count;
    }
}