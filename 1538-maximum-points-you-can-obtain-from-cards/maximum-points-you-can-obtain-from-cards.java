class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int leftsum=0;
      int max=0;
      int rightsum=0;
      for (int i=0;i<k;i++){
        leftsum+=cardPoints[i];
      }  
      max= Math.max(max,leftsum);
      int n=cardPoints.length-1;
      for (int i=k-1;i>=0;i--){
        leftsum-=cardPoints[i];
        rightsum+=cardPoints[n];
        max=Math.max(max,leftsum+rightsum);
        n--;
      }
      return max;
    }
}