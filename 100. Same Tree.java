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
    public boolean isSameTree(TreeNode p, TreeNode q) {

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		helper(p, list1);
		helper(q, list2);
		return (list1.equals(list2));

	}

		public void helper(TreeNode a, ArrayList<Integer> list) {
		if (a == null) {
			list.add(Integer.MAX_VALUE);
			return;
		}

		list.add(a.val);
		helper(a.left, list);
		helper(a.right, list);
	}

}
