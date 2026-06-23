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
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root);
    }

    public int diameter(TreeNode root){
        if(root == null){
            return 0; 
        }
        int leftDia = diameter(root.left);
        int rightDia = diameter(root.right);
        int withRoot = height(root.left) + height(root.right);
        int withoutRoot = Math.max(leftDia,rightDia);
        int ans = Math.max(withoutRoot,withRoot);
        return ans; 
    }
    
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }

        return 1 + Math.max(height(root.left),height(root.right));
    }


}
