class Solution {
    public String rearrangeString(String s, char x, char y) {
        int xc=0,yc=0;
        for(char c:s.toCharArray()){
            if(c==x)
                xc++;
            if(c==y)
                yc++;
        }
        s=s.replace(Character.toString(x),"");
        s=s.replace(Character.toString(y),"");
        while(xc>0){
            s=s+x;
            xc--;
        }
        while(yc>0){
            s=y+s;
            yc--;
        }
        return s;
    }
}