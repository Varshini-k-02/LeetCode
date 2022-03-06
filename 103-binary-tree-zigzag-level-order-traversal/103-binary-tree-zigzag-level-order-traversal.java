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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> wrapList=new LinkedList<List<Integer>>();
        if(root==null){
            return wrapList;
        }
        queue.add(root);
        boolean flag=true;
        while(!queue.isEmpty()){
            int level=queue.size();
            List<Integer> subList = new ArrayList<>();
            for(int i=0;i<level;i++){
                if(queue.peek().left!=null){
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.add(queue.peek().right);
                }
                if(flag==true){
                    subList.add(queue.remove().val);
                }
                else{
                    subList.add(0,queue.remove().val);
                }
            }
            flag=!flag;
            wrapList.add(subList);
        }
        return wrapList;
    }
}