class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int l = 1, r = 0;

        for(int i : piles)
            r = Math.max(r, i);

        while(l <= r) {
            int m = (r-l)/2+l;
            long k = 0;

            for(int i : piles)
                k += (i + (long)m - 1) / m;

            if(k <= h)
                r = m - 1;
            else
                l = m + 1;
        }

        return l;
    }
}