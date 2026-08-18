class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int n=trips.length;
        PriorityQueue<int []> x=new PriorityQueue<>((a,b)->{
            if(a[0]!=b[0])
            return a[0]-b[0];
            return a[1]-b[1];
        });
        for(int i=0;i<n;i++){
        x.offer(new int[]{trips[i][1],trips[i][0]});
        x.offer(new int[]{trips[i][2],-trips[i][0]});
        }
        int s=0;
        while(!x.isEmpty()){
            int a[]=x.poll();
            s+=a[1];
            if(s>capacity)
            return false;
        }
        return true;
    }
}