class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> r=new LinkedList<>();
        Queue<Integer> d=new LinkedList<>();
        for(int i=0;i<senate.length();i++){
            char c=senate.charAt(i);
            if(c=='R')
            r.offer(i);
            else
            d.offer(i);
        }
        while(!r.isEmpty()&&!d.isEmpty()){
            int i=r.poll();
            int j=d.poll();
            if(i<j)
            r.offer(i+senate.length());
            else
            d.offer(j+senate.length());
        }
        return r.isEmpty()?"Dire":"Radiant";
    }
}