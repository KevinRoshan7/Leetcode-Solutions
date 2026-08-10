class Solution {
    public int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {
        long ans=0,s=0;
        int j=-1;
        int n=chargeTimes.length;
        PriorityQueue<int []> x=new PriorityQueue<>((a,b)->{
            return b[0]-a[0];
        });
        for(int i=0;i<n;i++){
            s+=runningCosts[i];
            x.offer(new int[]{chargeTimes[i],i});
            while(s*(i-j)+arrange(x,j)>budget){
                s-=runningCosts[++j];
            }
            ans=Math.max(ans,i-j);
        }
        return (int)ans;
    }
        int arrange(PriorityQueue<int []> x,int j){
            while(!x.isEmpty()&&x.peek()[1]<=j)x.poll();
            if(x.isEmpty())return 0;
            return x.peek()[0];
        }
}