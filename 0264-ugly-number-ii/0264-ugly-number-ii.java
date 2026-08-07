class Solution {
    public int nthUglyNumber(int n) {
        int p[]={2,3,5};
        PriorityQueue<Long> x=new PriorityQueue<>();
        HashSet<Long> y= new HashSet<>();
        x.offer(1L);
        y.add(1L);
        long cur=1L;
        for(int i=0;i<n;i++){
            cur=x.poll();
            for(int j:p){
                long z=cur*j;
                if(!y.contains(z)){
                    x.offer(z);
                    y.add(z);
                }
            }
        }
        return (int)cur;
    }
}