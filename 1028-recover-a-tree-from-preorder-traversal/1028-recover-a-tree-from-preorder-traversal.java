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
    public TreeNode recoverFromPreorder(String traversal) {
        Stack<TreeNode> s = new Stack<>();
        int i = 0, n = traversal.length();

        while (i < n) {
            int d = 0;

            while (i < n && traversal.charAt(i) == '-') {
                d++;
                i++;
            }

            int v = 0;
            while (i < n && Character.isDigit(traversal.charAt(i))) {
                v = v * 10 + (traversal.charAt(i) - '0');
                i++;
            }

            TreeNode node = new TreeNode(v);

            while (s.size() > d)
                s.pop();

            if (!s.isEmpty()) {
                TreeNode parent = s.peek();
                if (parent.left == null)
                    parent.left = node;
                else
                    parent.right = node;
            }

            s.push(node);
        }

        while (s.size() > 1)
            s.pop();

        return s.peek();
    }
}