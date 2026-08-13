class Solution {
public:
    int totalHammingDistance(vector<int>& nums) {
        int n=nums.size();
        int ans=0;

        for(int i=0; i<32; i++){

            int one=0;

            for(int num: nums){
                if((num>>i) & 1)
                    one++;
            }

            int zero=n-one;

            ans+=(one*zero);
        }

        return ans;
        
    }
};