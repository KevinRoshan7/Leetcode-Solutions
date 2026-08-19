class Solution {
    public int maxNumberOfFamilies(int n, int[][] a) {
        Arrays.sort(a, (x, y) -> {
            return x[0] - y[0];
        });
        int c = 0,v=0;
        for (int i = 0; i < a.length;) {
            int k = a[i][0];
            v++;
            HashSet<Integer> x = new HashSet<>();
            while (i < a.length && k == a[i][0]) {
                x.add(a[i][1]);
                i++;
            }
            if (x.size() >= 7)
                continue;
            if (!x.contains(5) && !x.contains(4)) {
                if (!x.contains(2) && !x.contains(3))
                    c++;
                else if (!x.contains(7) && !x.contains(6)) {
                    c++;
                    continue;
                }
            }
            if (!x.contains(7) && !x.contains(6) && !x.contains(9) && !x.contains(8))
                c++;
        }
        return c+(n-v)*2;
    }
}