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
   public boolean isValidBST(TreeNode root) {
        return check(Long.MIN_VALUE,root, Long.MAX_VALUE);
    }

    public boolean check(long min, TreeNode node, long max) 
    {
        if(node == null) return true;

        if(node.val <= min || node.val >= max)
            return false;

        return check(min , node.left, node.val) && check(node.val, node.right, max);
    }
}