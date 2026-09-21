class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<Integer> r = new ArrayList<>();
        List<List<Integer>> revGraph = new ArrayList<>();
        Queue<Integer> x = new LinkedList<>();
        int[] o = new int[n];
        for (int i = 0; i < n; i++) {
            revGraph.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            o[i] = graph[i].length;
            if (o[i] == 0) {
                x.offer(i);
            }
            for (int j = 0; j < graph[i].length; j++) {
                revGraph.get(graph[i][j]).add(i); 
            }
        }

        while (!x.isEmpty()) {
            int k = x.poll();
            r.add(k);
            for (int neighbor : revGraph.get(k)) {
                o[neighbor]--;
                if (o[neighbor] == 0) {
                    x.offer(neighbor);
                }
            }
        }
        
        Collections.sort(r);
        return r;
    }
}