class Solution {
    public String clearDigits(String s) {
        Stack<Character> st= new Stack<>();
        StringBuilder sb = new StringBuilder();
       for (int i=0;i<s.length();i++){
           if (s.charAt(i)>='a' && s.charAt(i)<='z'){
            st.push(s.charAt(i));
           }
           else{
            st.pop();
           }
       }
       while(st.size()!=0){
           sb.append(st.pop());
       }
       return sb.reverse().toString();
    }
}