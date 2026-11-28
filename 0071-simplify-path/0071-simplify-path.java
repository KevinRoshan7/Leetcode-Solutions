class Solution {
    public String simplifyPath(String path) {
        String[] s = path.replaceFirst("^/+", "").split("/+");
        Stack<String> x = new Stack<>();
        
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(".") || s[i].isEmpty()) {
                continue;
            } else if (s[i].equals("..")) {
                if (!x.isEmpty()) {
                    x.pop();
                }
            } else {
                x.push(s[i]);
            }
        }
        
        return "/" + String.join("/", x);
    }
}