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
    public List<Integer>preeHelper(TreeNode root,List<Integer>list){
        if(root==null){return list;}
        list.add(root.val);
        preeHelper(root.left,list);
        preeHelper(root.right,list);
        return list;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        return preeHelper(root, list);
        
    }
}
