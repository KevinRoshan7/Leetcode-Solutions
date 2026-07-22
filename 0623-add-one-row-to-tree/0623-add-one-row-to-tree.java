
class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode n=new TreeNode(val);
            n.left=root;
            return n;
        }
        dfs(root,1,depth-1,val);
        return root;
    }
    void dfs(TreeNode root,int d,int m,int v){
        if(root==null)
        return;
        if(d==m){
            TreeNode x=root.left;
            TreeNode y=new TreeNode(v);
            root.left=y;
            y.left=x;
            TreeNode a=root.right;
            TreeNode b=new TreeNode(v);
            root.right=b;
            b.right=a;
            return;
        }
        dfs(root.left,d+1,m,v);
        dfs(root.right,d+1,m,v);
        return;
    }
}