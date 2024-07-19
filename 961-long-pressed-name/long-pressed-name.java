class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int a = 0;
        int b = 0;
        while (a < name.length() && b < typed.length()) {
            if (name.charAt(a) == typed.charAt(b)) {
                a++;
                b++;
            } else if (b > 0 && typed.charAt(b) == typed.charAt(b - 1)) {
                b++;
            } else {
                return false;
            }
        }
        
        while (b < typed.length() && typed.charAt(b) == name.charAt(name.length() - 1)) {
            b++;
        }
        
        return a == name.length() && b == typed.length();
    }
}
