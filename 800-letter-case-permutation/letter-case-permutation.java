class Solution {
    List<String> ans;
    public List<String> letterCasePermutation(String s) {
        ans=new ArrayList<>();
        sol(s.toCharArray(),0);
        return ans;
    }
    public void sol(char arr[],int idx){
        if(idx==arr.length){
            ans.add(new String(arr));
            return ;
        }
        sol(arr,idx+1);
        char ch=arr[idx];
        if(ch>='a' && ch<='z'){
            arr[idx]=Character.toUpperCase(ch);
            sol(arr,idx+1);
        }else if(ch>='A' && ch<='Z'){
            arr[idx]=Character.toLowerCase(ch);
            sol(arr,idx+1);
        }
    }
}