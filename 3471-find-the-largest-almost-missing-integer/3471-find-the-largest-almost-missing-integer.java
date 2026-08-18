class Solution {
    public int largestInteger(int[] nums, int k) {
        if(k==1){
            HashMap<Integer,Integer> x=new HashMap<>();
            for(int i=0;i<nums.length;i++)
            x.put(nums[i],x.getOrDefault(nums[i],0)+1);
            int m=-1;
            for(int i:x.keySet())
            if(x.get(i)==1)
            m=Math.max(m,i);
            return m;
        }
        else if(k==nums.length){
            int m=nums[0];
            for(int i=1;i<nums.length;i++)
            m=Math.max(m,nums[i]);
            return m;
        }
        else {
        int a=0,b=0;
        int av=nums[0],bv=nums[nums.length-1];
        if(av==bv)
        return -1;
        for(int i=1;i<nums.length-1;i++){
            if(av==nums[i])
            a++;
            else if(bv==nums[i])
            b++;
        }
       int ans=-1;
       if(a==0)
       ans=Math.max(ans,av);
       if(b==0)
       ans=Math.max(ans,bv);
       return ans;
       }
    }
}