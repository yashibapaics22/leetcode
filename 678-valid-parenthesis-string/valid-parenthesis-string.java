class Solution {
    public boolean checkValidString(String s) {
     Stack <Integer> parenthesis = new Stack<>();
     Stack <Integer> star = new Stack<>();
     for (int i=0;i<s.length();i++){
        if (s.charAt(i)=='(')
           parenthesis.push(i);
        else if (s.charAt(i)==')'){
            if (!parenthesis.isEmpty())   //empty nhi hai
               parenthesis.pop();
            else if (!star.isEmpty())
               star.pop();
            else 
               return false;
        }
        else{
            star.push(i);
        }
     }
     while(!parenthesis.isEmpty()){
        if (star.isEmpty())
           return false;
        if (star.peek()<parenthesis.peek())
           return false;
        star.pop();
        parenthesis.pop();
     }
     return true;
    }
}