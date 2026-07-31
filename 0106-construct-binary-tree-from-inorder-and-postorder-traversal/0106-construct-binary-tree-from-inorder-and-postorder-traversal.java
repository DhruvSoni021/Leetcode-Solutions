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
     public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return builder(0,n-1,0,n-1,inorder,postorder);
    }
    public TreeNode builder(int plo, int phi, int inlo, int inhi,int[] inorder, int[] postorder)
    {
        if(plo > phi || inlo > inhi) return null;
        int val = postorder[phi];
        TreeNode root = new TreeNode(val);
        int r = 0;
        for(int i=inlo;i<=inhi;i++)
        {
            if(inorder[i]==val)
            {
                r = i;
                break;
            }
        }
        int cnt = r-inlo;
        root.left = builder(plo,plo+cnt-1,inlo,r-1,inorder,postorder);
        root.right = builder(plo+cnt,phi-1,r+1,inhi,inorder,postorder);
        return root;
    }
}