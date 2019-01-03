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
  	public int currentDepth = 0;

	public int maxDepth(TreeNode root) {

		helper(root, 1);
		return currentDepth;
	}

	public void helper(TreeNode node, int Depth) {

		if (node == null)
			return;
		if (currentDepth < Depth)
			currentDepth = Depth;
		helper(node.left, Depth + 1);
		helper(node.right, Depth + 1);

	}

}
