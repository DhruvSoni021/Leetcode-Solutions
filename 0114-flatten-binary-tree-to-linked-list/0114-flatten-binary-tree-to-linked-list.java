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
     public void flatten(TreeNode root) {
        if(root==null) return;
        TreeNode lst = root.left;
        TreeNode rst = root.right;
        root.left = null;
        root.right = null;
        flatten(lst);    // bharosa rakho ki leftsubtree ko sahi kar dega
        flatten(rst);       // same for rst
        root.right = lst;
        TreeNode last = root; //  ye lst ka last element hoga aagar pehele lst null na ho
        while(last.right!=null) last = last.right;
        last.right = rst;
    }


    //     public void flatten(TreeNode root) {
    //     ArrayList<TreeNode> arr = new ArrayList<>();
    //     if(root==null) return;
    //     preorder(root,arr);
    //     for(int i=0;i<arr.size()-1;i++)
    //     {
    //         TreeNode a = arr.get(i);
    //         TreeNode b = arr.get(i+1);
    //         a.right = b;
    //         a.left = null;
    //     }
    //     TreeNode last = arr.get(arr.size()-1);
    //     last.left = null;
    //     last.right = null;
    // }

    // private void preorder(TreeNode root, ArrayList<TreeNode> ans) {
    //     if(root==null) return;
    //     ans.add(root);
    //     preorder(root.left,ans);
    //     preorder(root.right,ans);
    // }
}