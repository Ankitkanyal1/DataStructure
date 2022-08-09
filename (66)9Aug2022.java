// Approach 1 ==> Time Complexity ==> O(N)

class TrieNode{
    TrieNode[] children=new TrieNode[26];
    boolean isEnd=false;
}
class WordDictionary {
    TrieNode root;

    public WordDictionary() {
        root=new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode node=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(node.children[c-'a']==null){
                node.children[c-'a']=new TrieNode();
            }
            node=node.children[c-'a'];
        }
        node.isEnd=true;
    }
    
    private boolean search(String word,int i, TrieNode node){
        if(node==null) return false;
        if(i==word.length()) return node.isEnd;
        char c=word.charAt(i);
        if(c=='.'){
            for(int k=0;k<26;k++){
                if(search(word,i+1,node.children[k]))return true;
            }
        }
        else{
            if(search(word,i+1,node.children[c-'a'])) return true;
        }
        return false;
    }
    
    public boolean search(String word) {
        TrieNode node=root;
        return search(word,0,node);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
