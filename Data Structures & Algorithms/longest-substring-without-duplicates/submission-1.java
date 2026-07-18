class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        char[] stringAsChar = s.toCharArray();
        char l = 0;
        char r = 1;
        if (stringAsChar.length == 0) {
            return 0;
        }
        set.add(stringAsChar[l]);
        int max = set.size();

        while (r < stringAsChar.length) {
        
            if (!set.add(stringAsChar[r])) {
                set.remove(stringAsChar[l]);
                l++;

            } else {
                set.add(stringAsChar[r]);
                r++;
                max = Math.max(set.size(), max);
            }
        }
        return max;
    }
}
