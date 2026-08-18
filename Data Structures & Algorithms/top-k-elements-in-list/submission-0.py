class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        elements = {}
        result = []

        for num in nums:
            if num in elements:
                elements[num] += 1
            else:
                elements[num] = 1
        
        
        for i in range(k):
            max_key = max(elements, key = elements.get)
            result.append(max_key)
            elements.pop(max_key)

        return result

