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
    public int rob(TreeNode root) {
        int[] res=backtrack(root);
        return Math.max(res[0],res[1]);
    }
    int[] backtrack(TreeNode root){
        if(root==null)
        return new int[]{0,0};
        int l[]=backtrack(root.left);
        int r[]=backtrack(root.right);
        int s[]=new int[2];
        s[0]=Math.max(l[0],l[1])+Math.max(r[0],r[1]);
        s[1]=root.val+l[0]+r[0];
        return s;
    }
}