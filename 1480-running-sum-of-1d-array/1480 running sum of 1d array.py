class Solution(object):
    def runningSum(self, nums):
        running_sum=[]
        for i in range(len(nums)):
            running_sum.append(sum(nums[:i+1]))
        return running_sum   
