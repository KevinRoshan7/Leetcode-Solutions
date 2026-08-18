class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int p[]=new int[n+1];
        p[0]=0;
        for(int i=1;i<=n;i++)
        p[i]=nums[i-1]+p[i-1];
        int r[]=new int[n];
        for(int i=0;i<n;i++)
        r[i]=(nums[i]*(i+1)-p[i+1])+((p[n]-p[i+1])-nums[i]*(n-i-1));
        return r;
    }
}