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
    static List<List<Integer>>res;
    static List<Integer>add;
    static void dfs(TreeNode root,int target){
      if(root==null){
        return;
      }
      add.add(root.val);
      target-=root.val;
      if(root.left==null && root.right==null && target==0) {
        res.add(new ArrayList(add));
      }
      dfs(root.left,target);
      dfs(root.right,target);
      add.remove(add.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        res=new ArrayList<>();
        add=new ArrayList<>();
        dfs(root,targetSum);
        return res;
    }
}