class Solution {
    public int maxScore(int[] nums) {
        long s=0;
        int c=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
            s+=nums[i];
            if(s>0)
            c++;
        }
        return c;
    }
}