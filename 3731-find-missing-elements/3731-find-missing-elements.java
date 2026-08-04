class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> x=new ArrayList<>();
        int i=nums[0],j=0;
        while(j!=nums.length){
            if(nums[j]!=i)
            x.add(i);
            else 
            j++;
            i++;
        }
        return x;
    }
}