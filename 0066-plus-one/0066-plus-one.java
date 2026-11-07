class Solution {
    public int[] plusOne(int[] digits) {
        int x=digits.length-1;
        while(digits[x]==9&&x>0)
        {
            digits[x]=0;
            x--;
        }
        if(digits[x]==9)
        {
            int a[]=new int[digits.length+1];
            a[0]=1;
            return a;
        }
        digits[x]+=1;
        return digits;
    }
}