class Solution {
    public int minFlips(int a, int b, int c) {
        int f=0;
        while(a>0||b>0||c>0){
            int x=a&1,y=b&1,z=c&1;
            if(z==1){
                if(x==0&&y==0)
                f++;
            }
            else
            f+=x+y;
            a>>=1;
            b>>=1;
            c>>=1;
        }
        return f;
    }
}