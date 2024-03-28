class Solution {
    public boolean isValid(String s) {
    Stack<Character> ans= new Stack<Character>(); 
    for (int i=0;i<s.length();i++){
        char ch=s.charAt(i);
      if (ch=='(')
      ans.push(')');
      else if (ch=='{')
      ans.push('}');
      else if (ch=='[')
      ans.push(']');
      else if (ans.isEmpty()||ch!=ans.pop())
      return false;
    }
    return ans.isEmpty();
    }
}