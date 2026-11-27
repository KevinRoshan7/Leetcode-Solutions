class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n=items.length;
        int dp[]=new int[budget+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        int bonus[]=new int[n];
        for(int i=0;i<n;i++){
            int c=1;
            for(int j=0;j<n;j++){
                if(i!=j&&items[j][0]%items[i][0]==0)
                    c++;
            }
            bonus[i]=c;
        }
        for(int i=0;i<n;i++){
            int p=items[i][1];
            int b=bonus[i];
            int nextdp[]=Arrays.copyOf(dp,budget+1);
            for(int w=budget;w>=p;w--){
                if(dp[w-p]!=-1)
                    nextdp[w]=Math.max(nextdp[w],dp[w-p]+b);
            }
            for(int w=p;w<=budget;w++){
                if(nextdp[w-p]!=-1)
                    nextdp[w]=Math.max(nextdp[w],nextdp[w-p]+1);
            }
            dp=nextdp;
        }
        int ans=0;
        for(int w=0;w<=budget;w++){
            ans=Math.max(ans,dp[w]);
        }
        return ans;
    }
}