class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mp = {}
        for i in range(len(nums)):
            n = nums[i]; # Key
            diff = target - nums[i]
            if diff in mp:
                return [mp[diff], i]
            mp[n] = i # Value
