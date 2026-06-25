class Solution{
    public static int secondLargest(Node root){
        if(root == null || root.left == null && root.right == null){
            return -1;
        }
        if(root.right == null){
            return root.left.val;
        }
        Node child = root;
        Node parent = null;
        while(child.right != null){
            parent = child; 
            child = child.right;
        }
        
        if(child.left != null){
            Node newVar = child.left;
            while(newVar.right != null){
                newVar = newVar.right;
                return newVar.val;
            }
        }
        return parent.val;
    }
}
