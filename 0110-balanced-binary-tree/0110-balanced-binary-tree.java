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
    static boolean flag ;
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        flag = true;
        levels(root);
        return flag;
    }
    public int levels(TreeNode root)
    {
        if(root==null) return 0;
        int leftlevel = levels(root.left);
        int rightlevel = levels(root.right);
        if(Math.abs(leftlevel-rightlevel)>1) flag = false;
        return 1+Math.max(leftlevel,rightlevel);
    }

    // public boolean isBalanced(TreeNode root) {
    //     if(root==null) return true;
    //     int leftlevel = levels(root.left);
    //     int rightlevel = levels(root.right);
    //     if(Math.abs(leftlevel-rightlevel)>1) return false;
    //     return isBalanced(root.left) && isBalanced(root.right);
    // }
    // public int levels(TreeNode root)
    // {
    //     if(root==null) return 0;
    //     return 1+Math.max(levels(root.left),levels(root.right));
    // }
}