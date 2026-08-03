class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> x=new HashMap<>();
        for(String s:words)
        x.put(s,x.getOrDefault(s,0)+1);
        PriorityQueue<Map.Entry<String,Integer>> y=new PriorityQueue<>((a,b)->{
            if(b.getValue()!=a.getValue())
            return b.getValue()- a.getValue();
            return a.getKey().compareTo(b.getKey());
        });
        y.addAll(x.entrySet());
        List<String> z=new ArrayList<>();
        int i=0;
        while(!y.isEmpty()&&i!=k){
            Map.Entry<String,Integer> e=y.poll();
            z.add(e.getKey());
            i++;
        }
        return z;
    }
}