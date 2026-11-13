class MinStack {
int a[],top;
    public MinStack() {
        a=new int[100000];
        top=-1;
    }
    
    public void push(int value) {
        a[++top]=value;
    }
    
    public void pop() {
        top--;
    }
    
    public int top() {
        return a[top];
    }
    
    public int getMin() {
        int min=a[top];
        for(int i=0;i<=top;i++)
        min=Math.min(min,a[i]);
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */