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
    public boolean isValidBST(TreeNode root) {
        long startVal = Long.MIN_VALUE;
        long endVal = Long.MAX_VALUE;
        return isCheck(root,startVal, endVal);
    }

    public boolean isCheck(TreeNode root, long startVal, long endVal){
        if(root == null){
            return true;
        }

        if(root.val < startVal || root.val > endVal){
            return false;
        }

         boolean a = isCheck(root.left,startVal, (long)root.val - 1 );
         boolean b = isCheck(root.right, (long)root.val + 1  , endVal);

        return a && b;
    }
}
