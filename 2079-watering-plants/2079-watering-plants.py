class Solution:
    def wateringPlants(self, plants: List[int], capacity: int) -> int:
        c=capacity
        steps=0
        for i in range(0,len(plants)):
            if c<plants[i]:
                steps+=2*i
                c=capacity
            c-=plants[i]
            steps+=1
        return steps