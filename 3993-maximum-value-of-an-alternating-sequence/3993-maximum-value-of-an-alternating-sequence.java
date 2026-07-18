class Solution {
    public long maximumValue(int n, int s, int m) {
        long p=n/2;
        if(p==0)
            return s;
        return (long)s+p*m-(p-1);
    }
}