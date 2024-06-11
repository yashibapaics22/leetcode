class Solution {
    public int maximumSwap(int num) {
     String c= Integer.toString(num);
     char []ch=c.toCharArray();
     int n= ch.length;
     int max=num;
     for (int i=0;i<n;i++){
        for (int j=i+1;j<n;j++){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            // char[] st = {'7', '3', '2', '6'};  // Character array
            // String str = new String(st);       // Convert to String, str will be "7326"
            // int x = Integer.parseInt(str);     // Convert to integer, x will be 7326
            int x=Integer.parseInt(new String(ch));
            max=Math.max(max,x);
            temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
        }
     }  
     return max; 
    }
}