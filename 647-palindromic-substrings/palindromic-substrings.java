class Solution {
    public int countSubstrings(String s) {
    return (palindrome(s));   
    }
    public int palindrome(String s){
        //for odd
        int odd=0;
        for (int axis=0;axis<s.length();axis++){
            for (int orbit =0;axis-orbit>=0 && axis+orbit<s.length();orbit++){
                if (s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit))){
                break;
            }
            odd++;
            }
        }
        //for even
        int even=0;
        for (double axis=0.5;axis<s.length();axis++){
            for (double orbit =0.5;axis-orbit>=0 && axis+orbit<s.length();orbit++){
                if (s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit))){
                break;
            }
            even++;
            }
        }
        return odd+even;
    }
}