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
   	public ArrayList<Integer> temp = new ArrayList<>();

	public List<Integer> preorder(Node root) {

		myPreorder(root);
		return temp;

	}

	public void myPreorder(Node root) {

		if (root == null)
			return;
		temp.add(root.val);
		for (Node n : root.children)
			myPreorder(n);

	}

}
