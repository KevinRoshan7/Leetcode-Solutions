class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> x=new HashMap<>();
        int i=0,ans=0;
        for(int j=0;j<nums.length;j++){
            x.put(nums[j],x.getOrDefault(nums[j],0)+1);
            while (x.get(nums[j]) > k) {
                x.put(nums[i], x.get(nums[i]) - 1);
                i++;
            }
            ans=Math.max(ans,j-i+1);
        }
        return ans;
    } 
}