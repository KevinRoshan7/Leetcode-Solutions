class Solution {
    public int maxScore(int[] parent, int[] op, int[] score) {
        int n = parent.length;
        int[] deg = new int[n];
        for (int i = 1; i < n; ++i) {
            deg[parent[i]]++;
        }
        
        int[] sum = new int[n];
        int[] mini = new int[n];
        Arrays.fill(mini, Integer.MAX_VALUE);
        
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; ++i) {
            if (deg[i] == 0) q.offer(i);
        }
        
        while (!q.isEmpty()) {
            int u = q.poll();
            
            int ans = score[u] + (mini[u] == Integer.MAX_VALUE ? 0 : sum[u] - (op[u] == 1 ? mini[u] : Math.min(0, mini[u])));
            if (u == 0) return ans;
            
            int p = parent[u];
            sum[p] += ans;
            mini[p] = Math.min(mini[p], ans);
            
            if (--deg[p] == 0) {
                q.offer(p);
            }
        }
        return 0;
    }
}