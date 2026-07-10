class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length;

        int width = r - l - 1;
        int height = Math.min(heights[l], heights[r - 1]);

        int maxWater = width * height;

        while (l < r) {
            width = r - l - 1;
            height = Math.min(heights[l], heights[r - 1]);

            //Determine if the new volume is greater than the previous:
            int water = width * height;
            if (water > maxWater) {
                maxWater = water;
            }

            //Change parameter bars:
            if (heights[l] <= heights[r - 1]) {
                l++;
            } else {
                r--;
            }
            

        }
        return maxWater;
    }
}
