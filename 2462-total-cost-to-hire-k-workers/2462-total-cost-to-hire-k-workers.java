class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> s = new PriorityQueue<>();
        PriorityQueue<Integer> e = new PriorityQueue<>();

        int n = costs.length;
        int i = 0, j = n - 1;

        for(int l = 0; l < candidates && i <= j; l++)
            s.offer(costs[i++]);

        for(int l = 0; l < candidates && i <= j; l++)
            e.offer(costs[j--]);

        long ans = 0;

        while(k-- > 0) {
            if(e.isEmpty() || (!s.isEmpty() && s.peek() <= e.peek())) {
                ans += s.poll();

                if(i <= j)
                    s.offer(costs[i++]);
            }
            else {
                ans += e.poll();

                if(i <= j)
                    e.offer(costs[j--]);
            }
        }

        return ans;
    }
}