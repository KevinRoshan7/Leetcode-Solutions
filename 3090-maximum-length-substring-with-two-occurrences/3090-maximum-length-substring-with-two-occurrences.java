class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character , Integer> x=new HashMap<>();
        int max=0,j=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            x.put(c,x.getOrDefault(c,0)+1);
            while(x.get(c)>2){
                char ch=s.charAt(j);
                x.put(ch,x.get(ch)-1);
                j++;
            }
                max=Math.max(i-j+1,max);
            }
        return max;
    }
}