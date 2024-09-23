/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        return depth(root);
    }
    public int depth(Node root){
        int height=0;
        if (root==null){
            return 0;
        }
        for (Node i:root.children){
            height= Math.max(height,depth(i));
        }
        return height+1;
    }
}