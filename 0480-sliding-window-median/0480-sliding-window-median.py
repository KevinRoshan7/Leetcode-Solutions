class Solution:
    def medianSlidingWindow(self, nums: List[int], k: int) -> List[float]:
        m=[]
        x=[]
        for i in range(0,k):
            m.insert(bisect_left(m, nums[i]),nums[i])
        if k%2==0:
            x.append((m[k//2]+m[k//2-1])/2)
        else:
            x.append(m[k//2])
        for i in range(k,len(nums)):
            m.remove(nums[i-k])
            m.insert(bisect_left(m, nums[i]),nums[i])
            if k%2==0:
                x.append((m[k//2]+m[k//2-1])/2)
            else:
                x.append(m[k//2])
        return x