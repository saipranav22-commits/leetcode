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
        Queue<TreeNode>q=new LinkedList<>();
        List<List<Integer>>res=new ArrayList<>();
        if(root==null){
            return res;
        }
        q.add(root);
        int row=0;
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer>l=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode cur=q.poll();
                if(row%2==0){
                l.add(cur.val);
                }else{
                    l.add(0,cur.val);
                }
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
            row++;
            res.add(l);
        }
        return res;
    }
}