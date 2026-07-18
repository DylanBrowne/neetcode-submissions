class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 0 || s.length() > 1000) {
            throw new IllegalArgumentException("String length is out of bounds.");
        }
        if (s.length() == 0) {
            return 0;
        }

        Set<Character> set = new HashSet<>();
        char[] stringAsChar = s.toCharArray();
        char l = 0;
        char r = 1;
        
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
