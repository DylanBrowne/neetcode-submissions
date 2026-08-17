class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l = 0
        r = 0
        chars = set({})
        result = 0

        while (r != len(s)):
            if (s[r] not in chars):
                chars.add(s[r])
                r += 1
            else:
                chars.remove(s[l])
                l += 1
            result = max(result, r - l)
        return result