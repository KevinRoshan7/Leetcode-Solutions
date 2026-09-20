class Solution {
    public int reverseDegree(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            c+=(i+1)*(26-((int)s.charAt(i)-97));
        }
        return c;
    }
}