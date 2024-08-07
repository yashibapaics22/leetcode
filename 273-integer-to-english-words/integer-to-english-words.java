import java.util.*;
class Solution {
     private static HashMap<Integer,String> ones= new HashMap<>();
     private static HashMap<Integer,String> tens= new HashMap<>();
     static{
        ones.put(1,"One");
        ones.put(2,"Two");
        ones.put(3,"Three");
        ones.put(4,"Four");
        ones.put(5,"Five");
        ones.put(6,"Six");
        ones.put(7,"Seven");
        ones.put(8,"Eight");
        ones.put(9,"Nine");
        ones.put(10,"Ten");
        ones.put(11,"Eleven");
        ones.put(12,"Twelve");
        ones.put(13,"Thirteen");
        ones.put(14,"Fourteen");
        ones.put(15,"Fifteen");
        ones.put(16,"Sixteen");
        ones.put(17,"Seventeen");
        ones.put(18,"Eighteen");
        ones.put(19,"Nineteen");
        
        tens.put(2,"Twenty");
        tens.put(3,"Thirty");
        tens.put(4,"Forty");
        tens.put(5,"Fifty");
        tens.put(6,"Sixty");
        tens.put(7,"Seventy");
        tens.put(8,"Eighty");
        tens.put(9,"Ninety");
     }
    public String numberToWords(int num) {
        if(num==0)
        return "Zero";
        return convert(num).trim();
    }
    public static String convert (int num){
        StringBuilder str= new StringBuilder();
        if (num>=1000000000){
            int n=num/1000000000;
            str.append(convert(n)).append(" Billion");
            num=num%1000000000;
        }
        if (num>=1000000){
            int n=num/1000000;
            str.append(convert(n)).append(" Million");
            num=num%1000000;
        }
        if (num>=1000){
            int n=num/1000;
            str.append(convert(n)).append(" Thousand");
            num=num%1000;
        }
        if (num>=100){
            int n=num/100;
            str.append(" ").append(ones.get(n)).append(" Hundred");
            num=num%100;
        }
        if (num>=20){
            int n=num/10;
            str.append(" ").append(tens.get(n));
            num=num%10;
        }
        if (num>0){
            str.append(" ").append(ones.get(num));
        }
        return str.toString();
    }
}