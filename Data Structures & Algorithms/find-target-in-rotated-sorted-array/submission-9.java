class Solution {
    public int search(int[] nums, int target) {
        int theLeft = 0;
        int theRight = nums.length - 1;

        return helper(nums, target, theLeft, theRight);
    }

    public int helper(int[] theNums, int theTarget, int theLeft, int theRight) {
        if (theLeft > theRight) return -1;

        int theMid = (theLeft + theRight) / 2;
        
        if (theNums[theMid] == theTarget) return theMid;

        // Check if right half is sorted
        if (theNums[theRight] > theNums[theMid]) {
            // Check if the target lies within the range of the sorted right half
            if (theTarget >= theNums[theMid] && theTarget <= theNums[theRight]) { // Binary search right half
                theLeft = theMid + 1;

                return helper(theNums, theTarget, theLeft, theRight);

            // If the target doesnt lie in the range, search the other half
            } else {
                theRight = theMid - 1;

                return helper(theNums, theTarget, theLeft, theRight);
            }

        }
        
        // Check if left half is sorted
        if (theNums[theLeft] <= theNums[theMid]) {
            // Check if the target lies within the range of the sorted left half
            if (theTarget <= theNums[theMid] && theTarget >= theNums[theLeft]) { // Binary search left half
                theRight = theMid - 1;

                return helper(theNums, theTarget, theLeft, theRight);

            // If the target doesnt lie in the range, search the other half
            } else {
                theLeft = theMid + 1;

                return helper(theNums, theTarget, theLeft, theRight);
            }
        }
        return -1;
    }
}
