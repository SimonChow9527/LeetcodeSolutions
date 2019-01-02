/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int currentDepth = 0;

	public int maxDepth(Node root) {

		helper(root, 1);
		return currentDepth;
	}

	public void helper(Node node, int Depth) {

		if (node == null)
			return;
		if (currentDepth < Depth)
			currentDepth = Depth;
		for (Node n : node.children)
			helper(n, Depth + 1);

	}
}
