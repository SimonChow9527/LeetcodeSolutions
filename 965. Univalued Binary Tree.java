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
    int rootValue;
	boolean flag = true;

	public boolean isUnivalTree(TreeNode root) {
		
		rootValue = root.val;
		test(root);
		return flag;
	}

public void test(TreeNode node) {

		if(node==null)
			return;
		int val = node.val;		
		if (val != rootValue)
			flag = false;
		if (!flag)
			return;
		test(node.left);
		test(node.right);

	}
}
