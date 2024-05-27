class Solution {
    public int magicalString(int n) {
    if (n<=3)
    return 1;
    StringBuilder s= new StringBuilder("122");
    int ptr=2;
    int count=0;
    while(s.length()<n){
        int num=s.charAt(ptr)-'0';
        char toadd= (s.charAt(s.length()-1)=='1')?'2':'1';
        while(num>0){
            s.append(toadd);
            num--;
        }
        ptr++;
    }
    for (int i=0;i<n;i++){
        if (s.charAt(i)=='1')
        count++;
    }
    return count;
    }
}