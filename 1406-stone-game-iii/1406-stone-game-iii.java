class Solution {
    public String stoneGameIII(int[] stone) {
        int n=stone.length;
        int dp[]=new int[n+1];
        for(int i=n-1;i>=0;i--){
            int b=Integer.MIN_VALUE;
            int rs=0;
            for(int k=1;k<=3;k++){
                if(i+k>n) break;
                rs+=stone[i+k-1];
                b=Math.max(b,rs-dp[i+k]);
            }
            dp[i]=b;
        }
        if(dp[0]>0) return "Alice";
        else if(dp[0]<0) return "Bob";
        else
        return "Tie";
    }
}