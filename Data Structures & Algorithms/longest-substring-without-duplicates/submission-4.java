class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int l = 0;
        int r = 0;
        Set<Character> characters = new HashSet<>();

        while (r != s.length()) {
            if (characters.add(s.charAt(r))) {
                r++;
            } else {
                characters.remove(s.charAt(l));
                l++;
            }
            result = Math.max(result, r - l);
        }
        return result;
    }
}
