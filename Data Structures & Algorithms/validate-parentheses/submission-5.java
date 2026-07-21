class Solution {
    public boolean isValid(String s) {
        int l = 0, r = s.length() - 1;
        if (s.length() % 2 != 0) {
            return false;
        }
        while (l < r) {
            if ((s.charAt(l) == '{' && s.charAt(r) == '}')
                || (s.charAt(l) == '[' && s.charAt(r) == ']')
                || (s.charAt(l) == '(' && s.charAt(r) == ')')) {

                l++;
                r--;

            } else if ((s.charAt(l) == '{' && s.charAt(l + 1) == '}')
                        || (s.charAt(l) == '[' && s.charAt(l + 1) == ']')
                        || (s.charAt(l) == '(' && s.charAt(l + 1) == ')')) {
                l += 2;

            } else if ((s.charAt(r - 1) == '{' && s.charAt(r) == '}')
                        || (s.charAt(r - 1) == '[' && s.charAt(r) == ']')
                        || (s.charAt(r - 1) == '(' && s.charAt(r) == ')')) {
                r -= 2;

            } else {
                return false;
            }
        }
        return true;
    }
}
