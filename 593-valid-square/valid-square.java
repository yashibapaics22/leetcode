class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        HashSet<Integer> set= new HashSet<>();
        set.add(distance(p1, p4));
        set.add(distance(p1, p3));
        set.add(distance(p1, p2));
        set.add(distance(p2, p4));
        set.add(distance(p2, p3));
        set.add(distance(p3, p4));
        return !set.contains(0) && set.size()==2;
    }
    public static int distance(int[] a, int[] b) {
        int x = Math.abs(a[0] - b[0]);
        int y = Math.abs(a[1] - b[1]);
        return x * x + y * y;
    }
}