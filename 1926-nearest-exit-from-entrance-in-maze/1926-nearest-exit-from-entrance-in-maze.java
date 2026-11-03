
class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length, n = maze[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{entrance[0], entrance[1], 0});
        
        maze[entrance[0]][entrance[1]] = '+';

        while (!q.isEmpty()) {
            int a[] = q.poll();

            if (a[2] > 0 && (a[0] == 0 || a[0] == m-1 || a[1] == 0 || a[1] == n-1))
                return a[2];

            if (a[0]-1 >= 0 && maze[a[0]-1][a[1]] == '.') {
                maze[a[0]-1][a[1]] = '+';
                q.offer(new int[]{a[0]-1, a[1], a[2]+1});
            }

            if (a[0]+1 < m && maze[a[0]+1][a[1]] == '.') {
                maze[a[0]+1][a[1]] = '+';
                q.offer(new int[]{a[0]+1, a[1], a[2]+1});
            }

            if (a[1]-1 >= 0 && maze[a[0]][a[1]-1] == '.') {
                maze[a[0]][a[1]-1] = '+';
                q.offer(new int[]{a[0], a[1]-1, a[2]+1});
            }

            if (a[1]+1 < n && maze[a[0]][a[1]+1] == '.') {
                maze[a[0]][a[1]+1] = '+';
                q.offer(new int[]{a[0], a[1]+1, a[2]+1});
            }
        }

        return -1;
    }
}
