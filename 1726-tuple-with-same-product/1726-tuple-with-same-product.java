class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> x=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++)
            x.put(nums[i]*nums[j],x.getOrDefault(nums[i]*nums[j],0)+1);
        }
        int c=0;
        for(Integer i:x.keySet())
        c+=(x.get(i)*(x.get(i)-1)/2)*8;
        return c;
    }
}