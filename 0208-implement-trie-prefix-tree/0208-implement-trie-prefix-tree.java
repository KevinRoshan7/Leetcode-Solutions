class Trie {
TrieNode root;
    public Trie() {
        root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode cur=root;
        for(char c: word.toCharArray()){
            int i=c-'a';
            if(cur.child[i]==null){
                cur.child[i]=new TrieNode();
            }
            cur=cur.child[i];
        }
        cur.end=true;
    }
    
    public boolean search(String word) {
        TrieNode n=find(word);
        return n!=null&&n.end;
    }
    
    public boolean startsWith(String prefix) {
        return find(prefix)!=null;
    }
    public TrieNode find(String s){
        TrieNode cur=root;
        for(char c: s.toCharArray()){
            int i=c-'a';
            if(cur.child[i]==null)
            return null;
            cur=cur.child[i];
        }
        return cur;
    }
}
class TrieNode{
    TrieNode child[]=new TrieNode[26];
    boolean end=false;
}
