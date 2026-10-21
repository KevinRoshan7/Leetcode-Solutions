class Solution {
    public Node connect(Node root) {
        if (root == null)
            return root;

        Queue<Node> x = new LinkedList<>();
        x.offer(root);

        while (!x.isEmpty()) {
            Node y = x.poll();

            if (y.left != null) {
                y.left.next = y.right;

                if (y.next != null)
                    y.right.next = y.next.left;

                x.offer(y.left);
                x.offer(y.right);
            }
        }

        return root;
    }
}