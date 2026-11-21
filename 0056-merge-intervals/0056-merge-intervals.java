class Solution {
    public int[][] merge(int[][] intervals) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> 
            a.first != b.first ? Integer.compare(a.first, b.first) 
                               : Integer.compare(b.second, a.second)
        );

        for (int[] in : intervals) {
            pq.offer(new Pair(in[0], 1));
            pq.offer(new Pair(in[1], -1));
        }

        List<int[]> res = new ArrayList<>();
        int active = 0;
        int start = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            if (active == 0) {
                start = curr.first;
            }
            active += curr.second;
            if (active == 0) {
                res.add(new int[]{start, curr.first});
            }
        }

        return res.toArray(new int[0][]);
    }
}

class Pair {
    int first, second;
    Pair(int a, int b) {
        first = a;
        second = b;
    }
}