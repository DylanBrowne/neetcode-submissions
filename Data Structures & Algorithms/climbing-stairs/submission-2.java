class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        int count1 = 1;
        int count2 = 2;
        int count3 = 0;

        for (int i = 2; i < n; i++) {
            count3 = count1 + count2;
            count1 = count2;
            count2 = count3;
        }

        return count2;
    }
}
