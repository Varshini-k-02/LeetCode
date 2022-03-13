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
    int maxWidth=1;
    public int widthOfBinaryTree(TreeNode root) {
        
        if(root==null){
            return 0;
        }
        ArrayList<Integer> firstId=new ArrayList<>();
        traverse(root,1,0,firstId);
        return maxWidth;
    }
    void traverse(TreeNode root,int id,int depth,ArrayList<Integer> firstId){
        if(root==null){
            return ;
        }
        if(firstId.size()==depth){
            firstId.add(id);
        }
        else{
            maxWidth=Math.max(maxWidth,id-firstId.get(depth)+1);
        }
        traverse(root.left,id*2,depth+1,firstId);
        traverse(root.right,id*2+1,depth+1,firstId);
    }
}