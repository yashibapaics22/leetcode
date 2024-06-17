class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
     int l1=ax2-ax1;
     int b1=ay2-ay1;
     int l2=bx2-bx1;
     int b2=by2-by1;
     int sum=(l1*b1)+(l2*b2);
     int xoverlap=Math.min(ax2,bx2)-Math.max(ax1,bx1);
     int yoverlap=Math.min(ay2,by2)-Math.max(ay1,by1);
     if (xoverlap<0 || yoverlap<0){
        xoverlap=0;
        yoverlap=0;
     }
     int extra=xoverlap*yoverlap;
     return sum-extra;
    }
}