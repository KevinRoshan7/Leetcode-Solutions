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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> x=new LinkedList<>();
        List<Integer> result=new ArrayList<>();
        x.offer(root);
        while(!x.isEmpty()){
            int l=x.size();
            int z=-101;
            for(int i=0;i<l;i++){
                TreeNode y=x.poll();
                if(y==null)
                break;
                z=y.val;
                if(y.left!=null)
                x.offer(y.left);
                if(y.right!=null)
                x.offer(y.right);
            }
            if(z!=-101)
            result.add(z);
        }
        return result;
    }
}