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

	public List<Integer> postorder(Node root) {

		myPostorder(root);
		return temp;

	}

	public void myPostorder(Node root) {

		if (root == null)
			return;		
		for (Node n:root.children)
			myPostorder(n);
        temp.add(root.val);

	}

}
