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
    public boolean isCousins(TreeNode root, int x, int y) {
        int sum=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int count=queue.size();
            for(int i=0;i<count;i++){
                TreeNode node = queue.remove();
                if((node.left!=null && node.right!=null) && (node.left.val==x && node.right.val==y || node.left.val==y && node.right.val==x)){
                    return false;
                }
                if(node.val==x || node.val==y){
                    sum++;
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            if(sum==2){
                return true;
            }
            sum=0;
        }
        return false;
    }
}