class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 0 || s.length() > 1000) {
            throw new IllegalArgumentException("String length is out of bounds.");
        }
        if (s.length() == 0) {
            return 0;
        }

        Set<Character> set = new HashSet<>();
        int l = 0;
        int r = 1;
        
        set.add(s.charAt(l));
        int max = set.size();

        while (r < s.length()) {
        
            if (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;

            } else {
                set.add(s.charAt(r));
                r++;
                max = Math.max(set.size(), max);
            }
        }
        return max;
    }
}
