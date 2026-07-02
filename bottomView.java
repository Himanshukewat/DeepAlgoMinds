/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;

    }
}
*/

class Solution {
    class Pair {
        int level;
        int value;

        Pair(int level, int value) {
            this.level = level;
            this.value = value;
        }
    }
    TreeMap<Integer, Pair> map = new TreeMap<>();
    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        storeInMap(root, 0, 0);
        for (Pair p : map.values()) {
            ans.add(p.value);
        }
        return ans;
    }

    public void storeInMap(Node root, int hd, int level) {

        if (root == null)
            return;

        if (!map.containsKey(hd) || level >= map.get(hd).level) {
            map.put(hd, new Pair(level, root.data));
        }

        storeInMap(root.left, hd - 1, level + 1);
        storeInMap(root.right, hd + 1, level + 1);
    }
}
