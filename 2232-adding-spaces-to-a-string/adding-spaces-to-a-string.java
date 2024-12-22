class Solution {
    public String addSpaces(String s, int[] spaces) {
        int c=0;
        StringBuilder str= new StringBuilder();
        for (int i=0;i<s.length();i++){
           if (c<spaces.length && i==spaces[c]){
              str.append(" ");
              c++;
           }
           str.append(s.charAt(i));
        }
        return str.toString();
    }
}