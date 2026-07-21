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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int l=maxD(root);
        return dfs(root,l,0);
    }
    TreeNode dfs(TreeNode root,int m,int n){
        if(root==null)
        return null;
        if(m-1==n)
        return root;
        TreeNode l=dfs(root.left,m,n+1);
        TreeNode r=dfs(root.right,m,n+1);
        if(l!=null&&r!=null)
        return root;
        return l!=null?l:r;
    }
    int maxD(TreeNode root){
        if(root==null)return 0;
        return 1+Math.max(maxD(root.left),maxD(root.right));
    }
}