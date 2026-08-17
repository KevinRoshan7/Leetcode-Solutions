class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<List<Integer>> x=new PriorityQueue<>((a,b)->{
            int z=a.get(0)+a.get(1);
            int y=b.get(0)+b.get(1);
            return z-y;
        });
        int n=nums1.length,m=nums2.length;
        for(int i=0;i<n;i++)
        x.offer(Arrays.asList(nums1[i],nums2[0],0));
        List<List<Integer>> r=new ArrayList<>();
        while(k-->0){
            List<Integer> y=x.poll();
            r.add(Arrays.asList(y.get(0),y.get(1)));
            if(y.get(2)==m-1)continue;
            x.offer(Arrays.asList(y.get(0),nums2[y.get(2)+1],y.get(2)+1));
        }
        return r;
    }
}
