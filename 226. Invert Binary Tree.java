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
   public TreeNode invertTree(TreeNode root) {

		helper(root);
		return root;

	}

	public void helper(TreeNode node) {
		if (node == null)
			return;
		TreeNode tempNode = node.left;
		node.left = node.right;
		node.right = tempNode;
		

		helper(node.left);
		helper(node.right);
	}
}
