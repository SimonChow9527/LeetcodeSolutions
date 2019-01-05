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
   	public ArrayList<Integer> temp = new ArrayList<>();

	public TreeNode convertBST(TreeNode root) {

		helper(root);
		helper2(root);
		return root;
	}

	public void helper(TreeNode node) {
		if (node == null)
			return;
		helper(node.left);
		temp.add(node.val);
		helper(node.right);
	}

	public void helper2(TreeNode node) {
		if (node == null)
			return;
		helper2(node.left);
		int sum = 0;
		int index = temp.indexOf(node.val);
		for (int i = index+1; i < temp.size(); i++)
			sum += temp.get(i);
		node.val += sum;
		helper2(node.right);
	}

}
