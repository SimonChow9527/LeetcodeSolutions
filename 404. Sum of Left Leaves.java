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
   	public int sum = 0;

	public int sumOfLeftLeaves(TreeNode root) {

		helper(root);
		return sum;
	}

	public void helper(TreeNode node) {
		if (node == null)
			return;
		if (node.left != null&& node.left.left==null&& node.left.right==null)
			sum += node.left.val;
		helper(node.left);
		helper(node.right);
	}

}
