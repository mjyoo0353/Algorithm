class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}
        for num in nums:
            count[num] = count.get(num, 0) + 1

        arr = []
        for num, cnt in count.items():
            arr.append([cnt, num])
        arr.sort()

        result = []
        while(len(result)) < k:
            result.append(arr.pop()[1])
        return result
