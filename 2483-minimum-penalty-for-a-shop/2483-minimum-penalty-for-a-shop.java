class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();
        int r[]=new int[n];
        int y=0;
        char c[]=customers.toCharArray();
        for(int i=n-1;i>=0;i--){
            if(c[i]=='Y')
            y++;
            r[i]=y;
        }
        y=0;
        int l[]=new int[n+1];
        for(int i=0;i<n;i++){
            l[i]=y+r[i];
            if(c[i]=='N')
            y++;
        }
        l[n]=y;
        int min=n,m=0;
        for(int i=0;i<=n;i++)
        if(min>l[i])
        {
            min=l[i];
            m=i;
        }
        return m;
    }
}