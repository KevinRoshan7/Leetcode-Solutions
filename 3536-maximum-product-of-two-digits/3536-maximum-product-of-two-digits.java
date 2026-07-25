class Solution {
    public int maxProduct(int n) {
        String s=Integer.toString(n);
        int l=s.length();
        int a[]=new int[l];
        for(int i=0;i<l;i++){
            a[i]=n%10;
            n=n/10;
        }
        Arrays.sort(a);
        return a[l-1]*a[l-2];
    }
}