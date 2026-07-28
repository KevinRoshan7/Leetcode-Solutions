class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length() / 2;

        char c[] = s.substring(0, n).toCharArray();
        Arrays.sort(c);

        StringBuilder r = new StringBuilder();

        for (int i = 0; i < n; i++)
            r.append(c[i]);

        if (s.length() % 2 == 1)
            r.append(s.charAt(n));

        for (int j = n - 1; j >= 0; j--)
            r.append(c[j]);

        return r.toString();
    }
}