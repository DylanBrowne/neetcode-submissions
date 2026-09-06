class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int numberNeeded = target - nums[i];
            
            

            if (map.containsKey(numberNeeded) && map.get(numberNeeded) != i) {
                result[1] = i;
                result[0] = map.get(numberNeeded);
                return result;
            }
            // Value -> Index
            map.put(nums[i], i);
        }
        return result;
        
    }
}
