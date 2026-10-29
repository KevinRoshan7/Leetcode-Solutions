class Solution {
    public int minReorder(int n, int[][] connections) {
        Queue<Integer> p = new LinkedList<>();
        List<int[]>[] x = new ArrayList[n];
        boolean[] vis = new boolean[n];
        int c = 0;

        for (int i = 0; i < n; i++)
            x[i] = new ArrayList<>();

        for (int[] i : connections) {
            x[i[0]].add(new int[]{i[1], 1});
            x[i[1]].add(new int[]{i[0], 0});
        }

        p.offer(0);
        vis[0] = true;

        while (!p.isEmpty()) {
            int j = p.poll();

            for (int[] i : x[j]) {
                int next = i[0];

                if (!vis[next]) {
                    vis[next] = true;
                    c += i[1];
                    p.offer(next);
                }
            }
        }

        return c;
    }
}