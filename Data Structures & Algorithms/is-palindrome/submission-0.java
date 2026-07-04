class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (s.isEmpty()) return true;
        char[] string = s.toCharArray();
        
        for (int i = 0; i < string.length / 2; i++) {
            char L = string[i];
            char R = string[string.length - 1 - i];
            if (L != R) {
                return false;
            }
        }
        return true;
    }
}
