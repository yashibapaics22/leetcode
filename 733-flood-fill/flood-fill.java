class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original=image[sr][sc];
        if (original!=color){
            dfs(image,sr,sc,image.length,image[0].length,original,color);
        }
        return image;
    }
    public static void dfs(int [][] image,int sr,int sc,int n,int m,int original,int color){
        if (sr<0 || sc<0 || sr>=n || sc>=m || image[sr][sc]==color || image[sr][sc]!=original){
            return;
        }
        image[sr][sc]=color;
        dfs(image,sr+1,sc,n,m,original,color);
        dfs(image,sr,sc+1,n,m,original,color);
        dfs(image,sr-1,sc,n,m,original,color);
        dfs(image,sr,sc-1,n,m,original,color);
    }
}