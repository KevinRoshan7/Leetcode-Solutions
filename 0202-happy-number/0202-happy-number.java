class Solution {
    public boolean isHappy(int n) {
        while(n!=1&&n!=4){
            int x=0;
            while(n>0){
                x+=Math.pow(n%10,2);
                n=n/10;
            }
            n=x;
        }
        return n==1;
    }
}