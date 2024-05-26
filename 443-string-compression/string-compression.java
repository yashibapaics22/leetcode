class Solution {
    public int compress(char[] chars) {
        int count=1;
        StringBuilder sb= new StringBuilder();
     for (int i=0;i<chars.length-1;i++){
        char ch1=chars[i];
        char ch2=chars[i+1];
        if (ch1==ch2){
            count++;
        }
        else{
            if (count>1)
            sb.append(ch1).append(count);
            else
            sb.append(ch1);
            count=1;
        }
     }
     char last =chars[chars.length-1];
     if (count>1)
     sb.append(last).append(count); 
     else
     sb.append(last);
      String str= sb.toString();
      for (int i=0;i<str.length();i++){
        chars[i]=str.charAt(i);
      }
      return str.length();
    }
}