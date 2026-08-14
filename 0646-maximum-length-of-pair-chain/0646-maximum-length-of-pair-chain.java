class Solution {
    public int findLongestChain(int[][] pairs) {
        PriorityQueue<int []> x=new PriorityQueue<>((a,b)->{
            if(a[1]!=b[1])
            return a[1]-b[1];
            return a[0]-b[0];
        });
        for(int i[]: pairs)
        x.offer(i);
        int a[]=new int[2],r=1;
        a=x.poll();
        while(!x.isEmpty()){
            if(a[1]<x.peek()[0]){
                r++;
                a=x.poll();
            }
            else
            x.poll();
        }
        return r;
    }
}