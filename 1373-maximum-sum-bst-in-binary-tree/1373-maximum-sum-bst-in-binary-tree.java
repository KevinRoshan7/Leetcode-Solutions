
class Solution {
    int a=0;
 class info{
        boolean isbst;
        int max,min,sum;
        info(boolean a, int b, int c, int d){
            isbst=a;
            min=b;
            max=c;
            sum=d;
        }
    }
    public int maxSumBST(TreeNode root) {
        dfs(root);
        return a;
    }
    info dfs(TreeNode root){
        if(root==null)
        return new info(true,Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        info l=dfs(root.left);
        info r=dfs(root.right);
        if(!l.isbst||!r.isbst||root.val<=l.max||root.val>=r.min)
        return new info(false,0,0,0);
        int sum=root.val+l.sum+r.sum;
        a=Math.max(a,sum);
        return new info(true,Math.min(root.val,l.min),Math.max(root.val,r.max),sum);
    }
}