class Solution {
    public int maximumSwap(int num) {
        String s=Integer.toString(num);
        int n=s.length();
        char a[]=s.toCharArray();
        Arrays.sort(a);
        int i=0;
        for(i=0;i<n;i++){
            if(s.charAt(i)!=a[n-1-i])
            break;
        }
        if(i==n)
        return num;
        int l=s.lastIndexOf(a[n-1-i]);
        char r[]=s.toCharArray();
        char temp=r[i];
        r[i]=r[l];
        r[l]=temp;
        return Integer.parseInt(new String(r));
    }
}