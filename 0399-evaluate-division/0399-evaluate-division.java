class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String, List<Pair>> x = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);
            if (!x.containsKey(a))
                x.put(a, new ArrayList<>());
            x.get(a).add(new Pair(b, values[i]));
            if (!x.containsKey(b))
                x.put(b, new ArrayList<>());
            x.get(b).add(new Pair(a, 1.0 / values[i]));
        }
        int n = queries.size();
        double ans[] = new double[n];
        for (int i = 0; i < n; i++) {
            String a = queries.get(i).get(0);
            String b = queries.get(i).get(1);

            if (!x.containsKey(a) || !x.containsKey(b))
                ans[i] = -1.0;
            else
                ans[i] = dfs(a, b, x, new HashSet<String>());
        }
        return ans;
    }

    public double dfs(String src, String dest, HashMap<String, List<Pair>> x, HashSet<String> vis) {
        if (src.equals(dest))
            return 1.0;

        vis.add(src);

        for (Pair p : x.get(src)) {
            if (!vis.contains(p.first)) {
                double ans = dfs(p.first, dest, x, vis);

                if (ans != -1.0)
                    return p.second * ans;
            }
        }

        return -1.0;
    }
}

class Pair {
    String first;
    double second;

    Pair(String a, double b) {
        first = a;
        second = b;
    }
}