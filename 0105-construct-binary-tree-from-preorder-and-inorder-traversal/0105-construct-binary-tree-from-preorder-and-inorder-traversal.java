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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int []pre={0};
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(map,preorder,pre,0,preorder.length-1);
    }
    static TreeNode build(HashMap<Integer,Integer>map,int[]preorder,int pre[],int left,int right){
        if(left>right){
            return null;
        }
     int value=preorder[pre[0]];
     int index=map.get(value);
     TreeNode root=new TreeNode(value);
     pre[0]++;
     root.left=build(map,preorder,pre,left,index-1);
     root.right=build(map,preorder,pre,index+1,right);
     return root;
    }
}