class KthLargest {
PriorityQueue<Integer> x=new PriorityQueue<>();
int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int i:nums){
            x.offer(i);
            if(x.size()>k)
            x.poll();
        }
    }
    
    public int add(int val) {
        x.offer(val);
        if(x.size()>k)
        x.poll();
        return x.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */