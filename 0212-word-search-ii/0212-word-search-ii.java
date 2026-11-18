class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        TrieNode root = buildTrie(words);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, root, result);
            }
        }
        return result;
    }

    private void dfs(char[][] board, int r, int c, TrieNode node, List<String> result) {
        char ch = board[r][c];
        if (ch == '#' || node.children[ch - 'a'] == null) {
            return;
        }

        node = node.children[ch - 'a'];
        
        if (node.word != null) {
            result.add(node.word);
            node.word = null;
        }
        board[r][c] = '#';

        if (r > 0) dfs(board, r - 1, c, node, result);
        if (r < board.length - 1) dfs(board, r + 1, c, node, result);
        if (c > 0) dfs(board, r, c - 1, node, result);
        if (c < board[0].length - 1) dfs(board, r, c + 1, node, result);

        board[r][c] = ch;
    }

    private TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (String w : words) {
            TrieNode curr = root;
            for (char c : w.toCharArray()) {
                int idx = c - 'a';
                if (curr.children[idx] == null) {
                    curr.children[idx] = new TrieNode();
                }
                curr = curr.children[idx];
            }
            curr.word = w;
        }
        return root;
    }
}

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    String word;
}