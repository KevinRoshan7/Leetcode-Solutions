class Solution {
    public long countSubarrays(int[] nums, long k) {
        int i=0;
        long s=0,c=0;
        for(int j=0;j<nums.length;j++){
            s+=nums[j];
            while(i<=j&&s*(j-i+1L)>=k){
                s-=nums[i];
                i++;
            }
            c+=j-i+1;
        }
        return c;
    }
}