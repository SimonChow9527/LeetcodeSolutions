class Solution {
  

		public static int minMoves(int[] nums) {

		boolean equal = true;
		if (nums.length == 1) {
			return 0;
		} else {

			int sum=0;
			int min=nums[0];
			for(int a:nums)
			{
				sum+=a;
				min=Math.min(min, a);
			}
			return sum-nums.length*min;
		}
	}
}
