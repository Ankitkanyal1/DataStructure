// Approach 1 ==> Using Recursion || Time Complexity ==> O(H) where H--> Height of the node

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        String s="";
        recursion(root,s,list);
        return list;
    }
    public void recursion(TreeNode root,String s,List<String>list){
        if(root==null)return ;
        if(root.left==null && root.right==null){
            list.add(root.val);return;
        }
        else{
            recursion(root.left,s+root.val+"->",list);
            recursion(root.right,s+root.val+"->",list);
            return;
        }
    } 
}

Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]
