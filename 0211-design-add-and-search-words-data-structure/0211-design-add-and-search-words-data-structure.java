class WordDictionary {
Trie root;
    public WordDictionary() {
        root=new Trie();
    }
    
    public void addWord(String word) {
        Trie cur=root;
        for(char c:word.toCharArray()){
            int i=c-'a';
            if(cur.child[i]==null){
                cur.child[i]=new Trie();
                
            }
            cur=cur.child[i];
            
        }
        cur.end=true;
    }
    
    public boolean search(String word) {
        return find(word,0,root);
    }
    public boolean find(String word,int i,Trie cur){
        if (cur == null) return false;
        if (i == word.length()) return cur.end;
        char c = word.charAt(i);
        if (c == '.') {
            for (int j = 0; j < 26; j++) {
                if (find(word, i + 1, cur.child[j])) {
                    return true;
                }
            }
            return false;
        } else {
            return find(word, i + 1, cur.child[c - 'a']);
        }
    }
}

public class Trie{
    Trie child[];
    boolean end;
    Trie(){
        child=new Trie[26];
        end=false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */