

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!numbers.containsKey(nums[i])) {
                numbers.put(nums[i], 1); // Initialize number if found in array
            } else {
                return true;
            }
        }
        return false;
    }
}