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
        List<String> res = new ArrayList<>();
        dfs(root, "",res);
        
        return res;
    }
    
    private void dfs(TreeNode root, String path,List<String> res) {
        if(root == null) 
            return;
        
        path = path + String.valueOf(root.val);
        if(root.left == null && root.right == null)
            res.add(path);
        else {
            path = path + "->";
            dfs(root.left, path,res);
            dfs(root.right, path,res);
}
    }
}