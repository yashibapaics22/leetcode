class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer,List<Integer>> map= new HashMap<>();
        for (int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for (int [] edge:edges){
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        boolean [] visited= new boolean[n];
        return dfs(source,destination,map,visited);

    }
    public boolean dfs(int source,int destination, HashMap<Integer,List<Integer>> map,boolean []visited){
        if(source==destination){
            return true;
        }
        visited[source]=true;
        for(int neighbor:map.get(source)){
            if(!visited[neighbor]){
                if(dfs(neighbor,destination ,map,visited))
                return true;
            }
        }
        return false;
    }
}