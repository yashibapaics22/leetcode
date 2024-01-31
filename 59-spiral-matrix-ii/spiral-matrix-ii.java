class Solution {
    public int[][] generateMatrix(int n) {
        int [] [] matrix = new int [n][n];
        int count=1;
        int minr=0;
        int minc=0;
        int maxr=n-1;
        int maxc=n-1;
        int c=n*n;
        while(minr<=maxr && minc<=maxc ){
            for (int i=minc;i<=maxc && count<=c;i++){
               matrix[minr][i]=count++;
            }
            minr++;
            for (int i=minr;i<=maxr && count<=c;i++){
                matrix[i][maxc]=count++;
            }
            maxc--;
            for (int i=maxc;i>=minc && count<=c;i--){
                matrix[maxr][i]=count++;
            }
            maxr--;
            for (int i=maxr;i>=minr && count<=c;i--){
                matrix[i][minc]=count++;
            }
            minc++;
        }
        return matrix;
    }
}