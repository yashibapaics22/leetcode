class Solution {
    public String removeDuplicateLetters(String s) {
      StringBuilder st= new StringBuilder();
    int [] freq= new int [26];   
    for (int i=0;i<s.length();i++){
    freq[s.charAt(i)-'a']++; 
    }
    Stack <Character> sb= new Stack<>();
    boolean [] visited= new boolean[26];   // deafult value is false
    for (int i=0;i<s.length();i++){
        freq[s.charAt(i)-'a']--;
        if (visited[s.charAt(i)-'a']==true)
           continue;
        while(!sb.isEmpty() && freq[sb.peek()-'a']>0 && (sb.peek() >s.charAt(i))){
            visited[sb.pop()-'a']=false;
        }
        sb.push(s.charAt(i));
        visited[s.charAt(i)-'a']=true;
    }
    while(!sb.isEmpty()){
        st.append(sb.pop());
    }
    return st.reverse().toString();  
    }
}