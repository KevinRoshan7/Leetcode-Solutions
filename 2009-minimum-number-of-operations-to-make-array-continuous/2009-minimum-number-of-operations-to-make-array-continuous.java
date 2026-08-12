class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        HashSet<Integer> x=new HashSet<>();
        for(int i:nums)
        x.add(i);
        PriorityQueue<Integer> y=new PriorityQueue<>();
        for(int i: x){
            y.offer(i);
        }
        int ans=n;
        int size = y.size();
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        a[i]=y.poll();
        int l=0;
        for(int r=0;r<a.length;r++){
            while(a[r]-a[l]+1>n) l++;
            int need=n-(r-l+1);
            ans=Math.min(ans,need);
        }
        return ans;
    }
}