class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] a = s.split(" ");
        if (pattern.length() != a.length) {
            return false;
        }
        
        HashMap<Character, String> x = new HashMap<>();
        
        for (int i = 0; i < a.length; i++) {
            char c = pattern.charAt(i);
            
            if (x.containsKey(c)) {
                if (!x.get(c).equals(a[i])) {
                    return false;
                }
            } else {
                if (x.containsValue(a[i])) {
                    return false;
                }
                x.put(c, a[i]);
            }
        }
        
        return true;
    }
}