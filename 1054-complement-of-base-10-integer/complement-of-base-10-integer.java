class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;

        int bitLength = Integer.toBinaryString(n).length();
        
        int mask = (1 << bitLength) - 1;
        
        return n ^ mask;
    }
}