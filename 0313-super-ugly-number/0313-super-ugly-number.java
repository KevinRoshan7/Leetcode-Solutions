class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int dp[]=new int[n];
        HashMap<Integer,Integer> x=new HashMap<>();
        for(int i:primes)
        x.put(i,0);
        dp[0]=1;
        for(int i=1;i<n;i++){
            PriorityQueue<int []> y=new PriorityQueue<>((a,b)->{
                return a[0]-b[0];
            });
            for(int j:primes)
            y.offer(new int[]{dp[x.get(j)]*j,j});
            int a[]=y.poll();
            dp[i]=a[0];
            int min=a[0];
            for (int p : primes) {
    if (dp[x.get(p)] * p == min)
        x.put(p, x.get(p) + 1);
}
        }
        return dp[n-1];
    }
}