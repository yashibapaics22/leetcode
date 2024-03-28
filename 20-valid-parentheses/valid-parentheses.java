class Solution {
    public boolean isValid(String s) {
    Stack<Character> ans= new Stack<Character>(); 
    for (int i=0;i<s.length();i++){
        if ((s.charAt(i)=='(') || (s.charAt(i)=='{') ||(s.charAt(i)=='[')){
        ans.push(s.charAt(i));
    }
        else{
        if (ans.isEmpty())
        return false;
        char ch= ans.pop();
        if ((ch=='(' && s.charAt(i)==')') || (ch=='{' && s.charAt(i)=='}') || (ch=='[' && s.charAt(i)==']'))
        continue;
        else
        return false;
    }
    }
    return ans.isEmpty();
    }
}