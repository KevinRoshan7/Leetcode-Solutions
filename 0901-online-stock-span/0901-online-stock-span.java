class StockSpanner {
Stack<int[]> x;
    public StockSpanner() {
        x=new Stack<>();
    }
    
    public int next(int price) {
        int a=1;
        while(!x.isEmpty()&&x.peek()[0]<=price)
        a+=x.pop()[1];
        x.push(new int[]{price,a});
        return a;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */