class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> x=new PriorityQueue<>((a,b)->{
            int xa=a[0]*a[0]+a[1]*a[1];
            int xb=b[0]*b[0]+b[1]*b[1];
            return xa-xb;
        });
        for(int i[]:points)
        x.offer(i);
        int c=0;
        int r[][]=new int[k][2];
        while(c!=k){
            int i[]=x.poll();
            r[c]=i;
            c++;
        }
        return r;
    }
}