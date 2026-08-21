class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int r[]=new int[nums.length-k+1];
        for(int i=0;i<nums.length-k+1;i++){
            int f=0;
            for(int j=i;j<k+i-1;j++){
                if(nums[j]+1!=nums[j+1])
                {r[i]=-1;
                f=1;
                break;}
            }
            if(f!=1){
                r[i]=nums[i+k-1];
            }
        }
        return r;
    }
}