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
    TreeNode n;
    int m;
    public int findBottomLeftValue(TreeNode root) {
        n=root;
        m=0;
        dfs(root,0);
        return n.val;
    }
    void dfs(TreeNode root,int d){
        if(root==null)
        return;
        if(d>m){
            m=d;
            n=root;
        }
        dfs(root.left,d+1);
        dfs(root.right,d+1);
        return;
    }
}