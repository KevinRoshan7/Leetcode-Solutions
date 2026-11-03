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
 class Pair {
    int second;
    TreeNode first;

    Pair(TreeNode first, int second) {
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int maxLevelSum(TreeNode root) {
        ArrayList<Integer> x=new ArrayList<>();
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            TreeNode z=q.peek().first;
            int l=q.poll().second;
            if(x.size()<l+1)
            x.add(z.val);
            else
            x.set(l,x.get(l)+z.val);
            if(z.right!=null)
            q.offer(new Pair(z.right,l+1));
            if(z.left!=null)
            q.offer(new Pair(z.left,l+1));
        }
        return x.indexOf(Collections.max(x))+1;
    }
}