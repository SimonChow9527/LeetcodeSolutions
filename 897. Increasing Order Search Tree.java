/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public TreeNode result;
    public TreeNode current;
    public TreeNode increasingBST(TreeNode root) {

		ArrayList<Integer> temp = new ArrayList<>();
		helper(root, temp);
		result = new TreeNode(temp.get(0));
        current=result;
		for (int i = 1; i < temp.size(); i++) {           
			TreeNode child = new TreeNode(temp.get(i).intValue());
			insert(child);
		}

		return result;
	}

	public void helper(TreeNode node, ArrayList<Integer> list) {
		if (node == null)
			return;
		helper(node.left, list);
		list.add(node.val);
		helper(node.right, list);

	}
    public void insert(TreeNode child) {
		
        current.right = child;
        current=child;
	}
}
