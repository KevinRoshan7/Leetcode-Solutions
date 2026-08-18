class MyCalendarTwo {
PriorityQueue<int []> x;
    public MyCalendarTwo() {x=new PriorityQueue<>((a,b)->{
            if(a[0] != b[0])
        return a[0] - b[0];
    return a[1] - b[1];
        });
    }
    
    public boolean book(int startTime, int endTime) {
        PriorityQueue<int []> y=new PriorityQueue<>(x);
        y.offer(new int[]{startTime,1});
        y.offer(new int[]{endTime,-1});
        int c=0;
        while(!y.isEmpty()){
            int a[]=y.poll();
            c+=a[1];
            if(c==3){
            return false;}
        }
        x.offer(new int[]{startTime,1});
        x.offer(new int[]{endTime,-1});
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(startTime,endTime);
 */