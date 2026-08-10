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
    public int averageOfSubtree(TreeNode root) {
        if(root==null)
        return 0;
        int a=averageOfSubtree(root.left);
        int b=averageOfSubtree(root.right);
        if(sum(root)/size(root)==root.val)
        return 1+a+b;
        return a+b;
    }
    int sum(TreeNode x){
        if(x==null)
        return 0;
        return x.val+sum(x.left)+sum(x.right);
    }
    int size(TreeNode x){
        if(x==null)
        return 0;
        return 1+size(x.left)+size(x.right);
    }
}