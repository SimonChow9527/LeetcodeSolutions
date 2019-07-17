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
   	int sum=0;
	 public int rangeSumBST(TreeNode root, int L, int R) {
	        		
		helper(root,L,R);
		return sum;
	    }
	
	 public void helper(TreeNode root, int L, int R)
	 {
		 if(root==null)
			 return;
		 helper(root.left,L,R);
		 if(root.val>=L&&root.val<=R)			
			 sum+=root.val;
		 helper(root.right,L,R);
		  
	 }
}
