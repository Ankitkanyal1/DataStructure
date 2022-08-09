// Approach 1 ==> Time Complexity ==> O(N)

class TreeNode{
    TreeNode[] children=new TreeNode[26];
    boolean isEnd=false;
}
class Trie {
    TreeNode root;
    public Trie() {
        root=new TreeNode();
    }
    
    public void insert(String word) {
        TreeNode node=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(node.children[c-'a']==null){
                node.children[c-'a']=new TreeNode();
            }
            node=node.children[c-'a'];
        }
        node.isEnd=true;
    }
    
    public boolean search(String word) {
        TreeNode node=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(node.children[c-'a']==null){
                return false;
            }
            node=node.children[c-'a'];
        }
        return node.isEnd;        
    }
    
    public boolean startsWith(String prefix) {
        TreeNode node=root;
        for(int i=0;i<prefix.length();i++){
            char c=prefix.charAt(i);
            if(node.children[c-'a']==null){
                return false;
            }
            node=node.children[c-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
