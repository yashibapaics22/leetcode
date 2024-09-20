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
    public List<Integer> preorder(Node root) {
        List<Integer> ll= new ArrayList<>();
        if (root==null){
            return ll;
        }
        ll.add(root.val);
        for (Node child:root.children){
            ll.addAll(preorder(child));
        }
        return ll;
    }
}