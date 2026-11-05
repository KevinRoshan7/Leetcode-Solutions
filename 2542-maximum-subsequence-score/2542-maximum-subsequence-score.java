class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        Integer[] idx = new Integer[nums1.length];

        for(int i = 0; i < nums1.length; i++)
            idx[i] = i;

        Arrays.sort(idx, (a,b) -> Integer.compare(nums2[b], nums2[a]));

        long max = 0, sum = 0;

        for(int j = 0; j < nums1.length; j++) {
            int i = idx[j];

            q.offer(nums1[i]);
            sum += nums1[i];

            if(q.size() > k)
                sum -= q.poll();

            if(q.size() == k)
                max = Math.max(max, sum * nums2[i]);
        }

        return max;
    }
}