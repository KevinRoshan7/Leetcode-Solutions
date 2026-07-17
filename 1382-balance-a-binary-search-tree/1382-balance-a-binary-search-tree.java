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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> x=new ArrayList<>();
        inorder(root,x);
        return build(x,0,x.size()-1);
    }
    void inorder(TreeNode root,List<Integer> x){
        if(root==null)
        return;
        inorder(root.left,x);
        x.add(root.val);
        inorder(root.right,x);
        return;
    }
    TreeNode build(List<Integer> x,int l,int r){
        if(l>r)
        return null;
        int m=(l+r)/2;
        TreeNode root=new TreeNode(x.get(m));
        root.left=build(x,l,m-1);
        root.right=build(x,m+1,r);
        return root;
    }
}