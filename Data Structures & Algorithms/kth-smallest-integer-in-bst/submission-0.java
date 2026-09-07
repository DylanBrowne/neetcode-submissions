/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        return helper(root, k, maxHeap);
    }

    public int helper(TreeNode root, int k, PriorityQueue<Integer> maxHeap) {
        if (root == null) {
            return 0;
        }
        
        maxHeap.add(root.val);
        while (maxHeap.size() > k) {
            maxHeap.poll();
        }

        helper(root.left, k, maxHeap);
        helper(root.right, k, maxHeap);

        return maxHeap.peek();
    }
}
