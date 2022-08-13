// Approach 1 ==> Using Recursion || Time Complexity ==> O(N)  || Space Complexity ==> O(H)

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
    public void flatten(TreeNode root) {
        if(root == null) return;
        TreeNode templeft=root.left;
        TreeNode tempRight=root.right;
        root.left=null;
        flatten(templeft);
        flatten(tempRight);
        root.right=templeft;
        TreeNode curr=root;
        while(curr.right!=null) curr=curr.right;
        curr.right=tempRight;
    }
}

Input: root = [1,2,5,3,4,null,6]
Output: [1,null,2,null,3,null,4,null,5,null,6]

// Approach 2 ==> Time Complexity ==> O(N) || Space Complexity ==> O(1)

class Solution {
    public void flatten(TreeNode root) {
       if(root==null) return;
       while(root!=null){
           if(root.left!=null){
               TreeNode left=root.left;
               TreeNode current=left;
               while(current.right!=null) current=current.right;
               current.right=root.right;
               root.left=null;
               root.right=left;
           }
           root=root.right;
       }
    }
}
