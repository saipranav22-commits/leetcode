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
    static boolean dfs(TreeNode left,TreeNode right){
        if(left==null&&right==null){
            return true;
        }
        if(left==null || right==null){
            return false;
        }
        if(left.val!=right.val){
            return false;
        }
        boolean a=dfs(left.left,right.right);
        boolean b=dfs(left.right,right.left);
        return a&&b;
    }
    public boolean isSymmetric(TreeNode root) {
        return dfs(root.right,root.left);
    }
}