class Solution {
public:
    vector<int> countPoints(vector<vector<int>>& points, vector<vector<int>>& queries) {
        vector<int>ans;
        for(auto &q:queries){
            int x=q[0];
            int y=q[1];
            int r=q[2];

            int cnt=0;
            for(auto &p:points){
                int x1=p[0];
                int y1=p[1];

                int d1=x-x1;
                int d2=y-y1;
                 if(d1*d1+d2*d2<=r*r){
                    cnt++;           
                  
            }       

        }
        ans.push_back(cnt);
    }
        return ans;
    }
};