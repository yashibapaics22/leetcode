class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<BipartitePair> q = new LinkedList<>();
        HashMap<Integer, Integer> visited = new HashMap<>();

        for (int vtx = 0; vtx < graph.length; vtx++) {
            if (visited.containsKey(vtx)) {
                continue;
            }

            q.add(new BipartitePair(vtx, 0));

            while (!q.isEmpty()) {
                BipartitePair rp = q.poll();

                if (visited.containsKey(rp.vtx)) {
                    if (visited.get(rp.vtx) != rp.dis) {
                        return false;
                    }
                    continue;
                }

                visited.put(rp.vtx, rp.dis);

                for (int nbrs : graph[rp.vtx]) {
                    if (!visited.containsKey(nbrs)) {
                        q.add(new BipartitePair(nbrs, rp.dis + 1));
                    }
                }
            }
        }
        return true;
    }
}

class BipartitePair {
    int vtx;
    int dis;

    public BipartitePair(int vtx, int dis) {
        this.vtx = vtx;
        this.dis = dis;
    }
}
