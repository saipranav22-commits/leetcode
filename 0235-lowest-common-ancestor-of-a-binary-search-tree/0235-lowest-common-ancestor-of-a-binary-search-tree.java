/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode dfs(TreeNode root,TreeNode p,TreeNode q){
        if(root==null)return root;

        if(root.val>p.val && root.val>q.val){
            return dfs(root.left,p,q);
        }

        if(root.val<p.val && root.val<q.val){
            return dfs(root.right,p,q);
        }
        return root;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return root;
        return dfs(root,p,q);
    }
}