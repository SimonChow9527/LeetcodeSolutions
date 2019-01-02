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
public boolean leafSimilar(TreeNode root1, TreeNode root2) {

		ArrayList<Integer> temp1 = new ArrayList<>();
		ArrayList<Integer> temp2 = new ArrayList<>();

		helper(root1, temp1);
		helper(root2, temp2);

		if (temp1.size() != temp2.size())
			return false;
		else
			for (int i = 0; i < temp1.size(); i++)
				if (temp1.get(i) != temp2.get(i))
					return false;
		return true;

	}

	private void helper(TreeNode node, ArrayList<Integer> list) {
		if (node == null)
			return;
		if (node.left == null && node.right == null)
			list.add(node.val);
		helper(node.left, list);
		helper(node.right, list);
	}

}
