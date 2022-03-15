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
    public boolean isUnivalTree(TreeNode root) {
         if(root == null)
        return true;
    
    if(root.left != null)
        if(root.val != root.left.val)
            return false;
    
    if(root.right != null)
        if(root.val != root.right.val)
            return false;
    
    return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}