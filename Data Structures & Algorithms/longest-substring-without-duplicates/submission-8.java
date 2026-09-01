class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;

        Set<Character> set = new HashSet<>();

        int l = 0;
        int r = 1;
        

        set.add(s.charAt(l));
        int maxSubstring = set.size();
        int count = maxSubstring;

        while (r < s.length()) {
            
            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                r++;
                count++;
            } else {
                while (set.contains(s.charAt(r))) {
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(s.charAt(r));
                r++;
                count = s.substring(l, r).length();
            }
            maxSubstring = Math.max(maxSubstring, count);
        }
        return maxSubstring;
    }
}
