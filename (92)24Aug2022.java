// Approach 1 ==> Using Recursion || Time Complexity & Space Complexity ==> O(2^n) 
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
    Map<Integer,List<TreeNode>> list=new HashMap<>();
    public List<TreeNode> allPossibleFBT(int n) {
        if(!list.containsKey(n)){
            List<TreeNode> ans=new LinkedList();
            if(n==1){
                ans.add(new TreeNode(0));
            }
            else if(n%2==1){
                for(int x=0;x<n;x++){
                    int y=n-1-x;
                    for(TreeNode left:allPossibleFBT(x))
                    for(TreeNode right:allPossibleFBT(y)){
                            TreeNode b=new TreeNode(0);
                            b.left=left;
                            b.right=right;
                            ans.add(b);
                        }
                }
            }
            list.put(n,ans);
        }
        return list.get(n);
    }
}

//Input: n = 7
//Output: [[0,0,0,null,null,0,0,null,null,0,0],[0,0,0,null,null,0,0,0,0],[0,0,0,0,0,0,0],[0,0,0,0,0,null,null,null,null,0,0],[0,0,0,0,0,null,null,0,0]]


// Another Approach 

class Solution {
    HashMap<Integer,List<TreeNode>> cache;
    public List<TreeNode> allPossibleFBT(int n) {
        cache = new HashMap();
        return solve(n);
    }
    public List<TreeNode> solve(int n){
        if(n<=0)return null;
        if(n==1){return new ArrayList<TreeNode>(){{add(new TreeNode(0));}};}
        if(cache.containsKey(n))return cache.get(n);
        List<TreeNode> list = new ArrayList<TreeNode>();
        for(int i=1;i<n;i=i+2){
            List<TreeNode> left = solve(i);
            List<TreeNode> right = solve(n-i-1);
            if(left!=null && right!=null){
                for(TreeNode t1:left){
                    for(TreeNode t2:right){
                        TreeNode root  = new TreeNode(0);
                        root.left=t1;
                        root.right=t2;
                        list.add(root);
                    }
                }
            }
        }
        cache.put(n,list);
        return list;
    }
}
