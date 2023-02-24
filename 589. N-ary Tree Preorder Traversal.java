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
    List<Integer> l;
    public List<Integer> preorder(Node root) {
        l=new ArrayList<>();
        if(root ==null || root.children==null)
        {
            return l;
        }
        traverse(root);
        return l;
        
    }
    public void traverse(Node root)
    {
        if(root==null)
        {
            return;
        }
        l.add(root.val);
        for(Node e: root.children)
        {
            traverse(e);

        }
    }
}
