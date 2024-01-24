class Solution {
    static String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String>ll=new ArrayList<>();
        if (digits.length()==0)
        return ll;
        key_pad(digits,"",ll);
        return ll;
    }
     public static void key_pad(String ques,String ans,List<String>ll){
        if (ques.length()==0){
            ll.add(ans);
            return;
        }
        char ch=ques.charAt(0);  //2
        String press=map[ch-'0'];//abc
        for (int i=0;i<press.length();i++){
            key_pad(ques.substring(1),ans+press.charAt(i),ll);
        }
    }
}