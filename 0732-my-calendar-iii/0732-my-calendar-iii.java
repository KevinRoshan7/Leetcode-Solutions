class MyCalendarThree {
PriorityQueue<int []> x;
    public MyCalendarThree() {x=new PriorityQueue<>((a,b)->{
            if(a[0] != b[0])
        return a[0] - b[0];
    return a[1] - b[1];
        });  
    }
    
    public int book(int startTime, int endTime) {
        PriorityQueue<int []> y=new PriorityQueue<>(x);
        y.offer(new int[]{startTime,1});
        y.offer(new int[]{endTime,-1});
        int c=0,k=0;
        while(!y.isEmpty()){
            int a[]=y.poll();
            c+=a[1];
            k=Math.max(c,k);
        }
        x.offer(new int[]{startTime,1});
        x.offer(new int[]{endTime,-1});
        return k;
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(startTime,endTime);
 */