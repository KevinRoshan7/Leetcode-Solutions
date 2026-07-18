class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        long swaps=0;
        int c1=0,c2=0;
        long mod=1000000007;
        for(int i:nums){
            if(i<a)
                swaps=(swaps+c1+c2)%mod;
            else if(i>=a&&i<=b)
            {swaps=(swaps+c2)%mod;
            c1++;}
            else
                c2++;
        }
        return (int)swaps;
    }
}