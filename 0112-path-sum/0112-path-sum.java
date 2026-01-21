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
    static boolean dfs(TreeNode root,int target,int sum){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            return root.val+sum==target;
        }
        boolean a=dfs(root.left,target,sum+root.val);
        boolean b=dfs(root.right,target,sum+root.val);
        return a||b;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root,targetSum,0);
    }
}