/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null) return result;

        // first we add root value at first
        result.add(root.data);
        // we will be add left value except leaf nodes
        addleft(root.left, result);
        // we will be add leaf node
        if (root.left != null || root.right != null) {
            addleaf(root, result);
        }
        // same as addleft for sure change parmeter, and reverse right boundary
        ArrayList<Integer> temp = new ArrayList<>();
        addright(root.right, temp);
        for(int i=temp.size() - 1; i>=0; i--){
            result.add(temp.get(i));
        }
        return result;
        
    }
    
    void addleft(Node root,ArrayList<Integer> ans){
        // ArrayList<Integer> temp = new ArrayList<>();
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        
        ans.add(root.data);
        if(root.left != null){
            addleft(root.left,ans);
        } else{
            addleft(root.right, ans);
        }
    }
    
    void addright(Node root,ArrayList<Integer> temp){
        // ArrayList<Integer> temp = new ArrayList<>();
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        
        temp.add(root.data);
        if(root.right != null){
            addright(root.right,temp);
        } else{
            addright(root.left,temp);
        }
    }
    
    void addleaf(Node root, ArrayList<Integer> ans){
        if (root == null) {
            return;
        }
    
        if (root.left == null && root.right == null) {
            ans.add(root.data);
            return;
        }
    
        addleaf(root.left, ans);
        addleaf(root.right, ans);
    }
}
