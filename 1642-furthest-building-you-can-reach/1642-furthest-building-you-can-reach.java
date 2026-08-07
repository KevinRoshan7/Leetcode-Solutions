class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> x=new PriorityQueue<>();
        for(int i=0;i<heights.length-1;i++){
            if(heights[i+1]<=heights[i])continue;
            else if(ladders>0){
                ladders--;
                x.offer(heights[i+1]-heights[i]);
            }
            else if(!x.isEmpty()&&x.peek()<heights[i+1]-heights[i]){
                int a=x.poll();
                bricks-=a;
                x.offer(heights[i+1]-heights[i]);
            }
            else{
                bricks-=heights[i+1]-heights[i];
            }
            if(bricks<0)
            return i;
        }
        return heights.length-1;
    }
}