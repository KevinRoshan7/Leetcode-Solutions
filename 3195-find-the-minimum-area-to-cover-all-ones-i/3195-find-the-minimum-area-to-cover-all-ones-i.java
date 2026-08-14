class Solution {
    public int minimumArea(int[][] grid) {
        int c1=-1,r1=-1,c2=grid[0].length-1,r2=grid.length-1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    c1=Math.max(c1,j);
                    r1=Math.max(r1,i);
                    c2=Math.min(c2,j);
                    r2=Math.min(r2,i);
                }
            }
        }
        return (r1-r2+1)*(c1-c2+1);
    }
}