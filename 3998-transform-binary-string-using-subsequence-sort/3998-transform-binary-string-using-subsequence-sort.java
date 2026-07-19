class Solution {
    public boolean[] transformStr(String s, String[] strs) {
        int n=s.length();
        int z=0;
        int zero[]=new int[n];
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0')
                z++;
            zero[i]=z;
        }
        int m=strs.length;
        boolean a[]=new boolean[m];
        for(int i=0;i<m;i++){
            String str=strs[i];
            int cz=0;
            int q=0;
            for(int j=0;j<n;j++){
                char c=str.charAt(j);
                if(c=='0')cz++;
                else if(c=='?')q++;
            }
            if(cz>z||cz+q<z){
                a[i]=false;
                continue;
            }
            int nz=z-cz;
            int strz=0;
            int rz=0;
            boolean p=true;
            for(int j=0;j<n;j++){
                char c=str.charAt(j);
                if(c=='0')
                    strz++;
                else if(c=='?'){
                    if(rz<nz){
                        strz++;
                        rz++;
                    }
                }
                if(strz<zero[j]){
                    p=false;
                    break;
                }
            }
            a[i]=p;
        }
        return a;
    }
}