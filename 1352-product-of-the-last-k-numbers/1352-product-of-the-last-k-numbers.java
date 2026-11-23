class ProductOfNumbers {
ArrayList<Integer> x;
    public ProductOfNumbers() {
        x=new ArrayList<>();
        x.add(1);
    }
    
    public void add(int num) {
        if(num==0)
        {
            x.clear();
            x.add(1);
        }
        else
        x.add(num*x.get(x.size()-1));
    }
    
    public int getProduct(int k) {
        if(k>=x.size())
        return 0;
        int n=x.size();
        return x.get(n-1)/x.get(n-k-1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */