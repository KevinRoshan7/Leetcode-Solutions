class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int []> x=new PriorityQueue<>((a,b)->{
            if(a[0]!=b[0])
            return a[0]-b[0];
            return a[1]-b[1];
        });
        int m=Integer.MIN_VALUE;
        for(int i=0;i<nums.size();i++){
            int z=nums.get(i).get(0);
            x.offer(new int[]{z,i,0});
            m=Math.max(m,z);
        }
        int s=0,e=Integer.MAX_VALUE;
        while(true){
            int a[]=x.poll();
            int min=a[0];
            if(m-min<e-s){
                s=min;
                e=m;
            }
            if(a[2]+1==nums.get(a[1]).size())
            break;
            int next=nums.get(a[1]).get(a[2]+1);
            m=Math.max(next,m);
            x.offer(new int[]{next,a[1],a[2]+1});
        }
        return new int[]{s,e};
    }
}