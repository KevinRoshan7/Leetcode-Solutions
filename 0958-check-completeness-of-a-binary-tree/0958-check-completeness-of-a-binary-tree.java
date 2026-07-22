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
    public boolean isCompleteTree(TreeNode root) {
        int n=maxd(root);
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int c=0;
        while(!q.isEmpty()){
            int s=q.size();
            if(c<n-1&&s!=Math.pow(2,c))
            return false;
            c++;
            if (c == n - 1) {
                boolean seenNull = false;

                for (int i = 0; i < s; i++) {

                    TreeNode x = q.poll();

                    if (x.left != null) {
                        if (seenNull) return false;
                        q.offer(x.left);
                    } else {
                        seenNull = true;
                    }

                    if (x.right != null) {
                        if (seenNull) return false;
                        q.offer(x.right);
                    } else {
                        seenNull = true;
                    }
                }
                break;
            }
            for(int i=0;i<s;i++){
                TreeNode x=q.poll();
                if(x.left!=null)
                q.offer(x.left);
                if(x.right!=null)
                q.offer(x.right);
            }
        }
        
        return true;
    }
    int maxd(TreeNode root){
        if(root==null)
        return 0;
        int l=maxd(root.left);
        int r=maxd(root.right);
        return 1+Math.max(l,r);
    }
}