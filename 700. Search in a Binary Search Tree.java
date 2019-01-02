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
   public TreeNode searchBST(TreeNode root, int val) {

		TreeNode node;
		node = search(root, val);
		return node;

	}

	public TreeNode search(TreeNode node, int val) {

		if (node == null || node.val == val)
			return node;
		if (val < node.val)
			return search(node.left, val);
		return search(node.right, val);
	}
}
