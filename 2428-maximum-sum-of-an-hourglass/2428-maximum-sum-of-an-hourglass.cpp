class Solution {
public:
    int maxSum(vector<vector<int>>& grid) {
        int n=grid.size();
        int m=grid[0].size();
        int maxi=0; 
        for(int i=0;i<n-2;i++){
            for(int j=0;j<m-2;j++){
                int sum=0;
                sum+=grid[i][j];
                sum+=grid[i][j+1];
                sum+=grid[i][j+2];
                sum+=grid[i+1][j+1];
                sum+=grid[i+2][j];
                sum+=grid[i+2][j+1];
                sum+=grid[i+2][j+2];

                maxi=max(maxi,sum);
            }
        }
        return maxi;
    }
};