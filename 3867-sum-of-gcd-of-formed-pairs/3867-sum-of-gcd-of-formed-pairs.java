class Solution {
    public long gcdSum(int[] nums) {
        int p[]=new int[nums.length];
        int m=nums[0];
        for(int i=0;i<nums.length;i++)
            {
                m=Math.max(m,nums[i]);
                p[i]=gcd(m,nums[i]);
            }
        Arrays.sort(p);
        long s=0;
        for(int i=0;i<nums.length/2;i++)
            {
                s+=gcd(p[i],p[p.length-1-i]);
            }
        return s;
    }
    int gcd(int a,int b)
    {
        while(b!=0)
            {
                int t=b;
                b=a%b;
                a=t;
            }
        return a;
    }
}