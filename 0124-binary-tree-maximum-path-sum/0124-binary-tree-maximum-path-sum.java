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
    HashMap<TreeNode ,Integer> dp=new HashMap<>();
    public int maxPathSum(TreeNode root) {
        return maxroot(root);
    }
    int backtrack(TreeNode root){
        if(root==null)
        return 0;
        if(dp.containsKey(root))
        return dp.get(root);
        int left = Math.max(0, backtrack(root.left));
int right = Math.max(0, backtrack(root.right));

dp.put(root, root.val + Math.max(left, right));
        return dp.get(root);
    }
    int maxroot(TreeNode root){
        if(root==null)
        return Integer.MIN_VALUE;
        int left = Math.max(0, backtrack(root.left));
int right = Math.max(0, backtrack(root.right));

int r = root.val + left + right;
        return Math.max(r,Math.max(maxroot(root.left),maxroot(root.right)));
    }
}