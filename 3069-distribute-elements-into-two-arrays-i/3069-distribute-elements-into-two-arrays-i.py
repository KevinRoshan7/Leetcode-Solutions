class Solution:
    def resultArray(self, nums: List[int]) -> List[int]:
        a=([nums[0]],[nums[1]])
        for x in nums[2:]:
            a[a[0][-1]<=a[1][-1]].append(x)
        return a[0]+a[1]