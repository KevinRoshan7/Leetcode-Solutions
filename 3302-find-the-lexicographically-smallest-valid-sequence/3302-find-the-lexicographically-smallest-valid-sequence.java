class Solution {
    public int[] validSequence(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int r=m-1;
        int c=0;
        int right[]=new int[n];
        for(int i=n-1;i>=0;i--){
            right[i]=c;
            if(r>=0&&word1.charAt(i)==word2.charAt(r)){
                r--;
                c++;
            }
        }
        boolean change=false;
        int a[]=new int[m];
        int j=0;
        for(int i=0;i<n&&j<m;i++){
            if(word1.charAt(i)==word2.charAt(j)){
                a[j]=i;
                j++;
            }
            else if(!change&&right[i]>=m-j-1){
                a[j]=i;
                j++;
                change=true;
            }
        }
        if(j==m)
        return a;
        else return new int[]{};
    }
}