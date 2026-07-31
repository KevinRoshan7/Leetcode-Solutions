class Solution {
    public String largestNumber(int[] nums) {
        Integer n[] = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++)
            n[i] = nums[i];
        Arrays.sort(n, (a, b) -> {
            String ab = a + "" + b;
            String ba = b + "" + a;
            return ba.compareTo(ab);
        });
        StringBuilder sb = new StringBuilder();
        for (int x : n)
            sb.append(x);

        if (sb.charAt(0) == '0')
            return "0";

        return sb.toString();
    }
}