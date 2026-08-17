class Solution {
    public int stoneGameV(int[] stoneValue) {
        int n=stoneValue.length;
        int a[]=new int[n+1];
        a[0]=0;
        for(int i=1;i<=n;i++)
        a[i]=stoneValue[i-1]+a[i-1];
        int dp[][]=new int[n][n];
        for(int i[]:dp)
        Arrays.fill(i,-1);
        return backtrack(a,dp,0,n-1);
    }
    int backtrack(int a[],int dp[][],int l,int r){
        if(dp[l][r]!=-1)
        return dp[l][r];
        int ans=0;
        for(int m=l;m<r;m++){
            int ls=a[m+1]-a[l];
            int rs=a[r+1]-a[m+1];
            if(ls<=rs)ans=Math.max(ans,ls+backtrack(a,dp,l,m));
            if(ls>=rs)ans=Math.max(ans,rs+backtrack(a,dp,m+1,r));
            if (2*Math.min(ls, rs)<=ans) break;
        }
        return dp[l][r]=ans;
    }
}