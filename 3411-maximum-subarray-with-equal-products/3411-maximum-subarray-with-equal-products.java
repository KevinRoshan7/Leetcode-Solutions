class Solution {
    public int maxLength(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            long p = 1, g = 0, l = 1;
            for (int j = i; j < nums.length; j++) {
                p *= nums[j];
                g = gcd(g, nums[j]);
                l = lcm(l, nums[j]);
                
                if (p == g * l) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }

    long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}