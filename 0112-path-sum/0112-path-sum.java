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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(root.left==null && root.right==null)
        {
            if(targetSum==root.val) return true;
            else return false;
        }
        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
    }
}


// class Solution {
//     int target;
//     public boolean hasPathSum(TreeNode root, int targetSum) {
//         target = targetSum;
//         return helper(root,0);
//     }
//     public boolean helper(TreeNode root, int sum)
//     {
//         if(root == null) return false;
//         sum+=root.val;
//         if(root.left==null && root.right==null) return sum == target;
//         boolean lsum = helper(root.left,sum);
//         boolean rsum = helper(root.right,sum);
//         return lsum||rsum;
//     }
// }