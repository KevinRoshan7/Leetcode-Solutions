class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n=intervals.length;
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            a[i][0]=intervals[i][0];
            a[i][1]=i;
        }
        Arrays.sort(a,(x,y)->x[0]-y[0]);
        int result[]=new int[n];
        for(int i=0;i<n;i++){
            int x=intervals[i][1];
            int l=0,r=n-1,ans=-1;
            while(l<=r){
                int m=l+(r-l)/2;
                if(a[m][0]>=x){
                    ans=a[m][1];
                    r=m-1;
                }
                else
                l=m+1;
            }
            result[i]=ans;
        }
        return result;
    }
}