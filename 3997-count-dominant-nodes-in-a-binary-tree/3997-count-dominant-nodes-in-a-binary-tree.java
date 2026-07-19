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
    int c=0;
    public int countDominantNodes(TreeNode root) {
        int max=count(root);
        return c;
    }
    int count(TreeNode root){
        if(root==null)
            return Integer.MIN_VALUE;
        int left=count(root.left);
        int right=count(root.right);
        int max=Math.max(root.val,Math.max(left,right));
        if(root.val==max)
            c++;
        return max;
    }
}