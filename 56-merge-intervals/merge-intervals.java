class Solution {
    public int[][] merge(int[][] intervals) {
    List<int[]>res=new ArrayList<>();           //declaring list of arrays
    if (intervals.length==0 || intervals ==null)
    return res.toArray(new int [0][]);
    Arrays.sort(intervals,(a,b)-> a[0]-b[0]);     //sorting in ascending order
    int start = intervals[0][0];
    int end=intervals[0][1];
    for (int []i:intervals){
        if (i[0]<=end){
            end=Math.max(end,i[1]);
        }
        else{
            res.add(new int []{start,end});
            start=i[0];
            end=i[1];
        }
    }
    res.add(new int []{start,end});          //converting to array and adding last value in  2d array
    return res.toArray(new int [0][]);
    }
}