class Solution {
    public int minimumPushes(String word) {
        Character c[]=new Character[word.length()];
        HashMap<Character,Integer> x=new HashMap<>();
        for(int i=0;i<word.length();i++)
        {
                    char ch=word.charAt(i);
                    c[i]=ch;
        x.put(ch,x.getOrDefault(ch,0)+1);}
        Arrays.sort(c,(a,b)->{
            int fa=x.get(a);
            int fb=x.get(b);
            if(fa!=fb)
            return fb-fa;
            return a-b;
        });
        int count=1,f=0,sum=0;
        for(int i=0;i<word.length();i++){
            char ch=c[i];
            while(i<word.length()&&c[i]==ch)
            {sum+=count;
            i++;}
            i--;
            f++;
            if(f%8==0)
            count++;
        }
        return sum;
    }
}