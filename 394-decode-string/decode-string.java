class Solution {
    public String decodeString(String s) {
     char [] arr= s.toCharArray();
     Stack<Integer> st1=new Stack<>();
     Stack<StringBuilder> st2= new Stack<>();
     StringBuilder str= new StringBuilder();
     int k=0;
     for (int i=0;i<arr.length;i++){
        if (arr[i]=='['){
            st1.push(k);
            k=0;
            st2.push(str);
            str= new StringBuilder();
        }
        else if (arr[i]==']'){
            int n=st1.pop();
            StringBuilder prev= str;
            str=st2.pop();
           while(n!=0){
            str.append(prev);
            n--;
           }
        }
        else if (arr[i]>='0' && arr[i]<='9'){
            k=k*10+(arr[i]-'0'); 
        }
        else{
            str.append(arr[i]);
        }
     }
     return str.toString();
    }
}