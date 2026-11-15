class Solution {
    public int countConsistent(int[] nums) {
        int n = nums.length;
        int ans = 0;
        
        for (int i = 0; i < n; ++i) {
            int mini = nums[i];
            int op = nums[i];
            for (int j = i; j < n; ++j) {
                mini = Math.min(mini, nums[j]);
                op &= nums[j];
                if (op == mini) {
                    ans++;
                }
            }
        }
        
        return ans;
    }
}