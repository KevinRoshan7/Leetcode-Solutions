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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
        return result;
        Queue<TreeNode> x=new LinkedList<>();
        x.offer(root);
        while(!x.isEmpty()){
            int l=x.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<l;i++){
                TreeNode y=x.poll();
                level.add(y.val);
                if(y.left!=null)
                x.offer(y.left);
                if(y.right!=null)
                x.offer(y.right);
            }
            result.add(level);
        }
        return result;
    }
}