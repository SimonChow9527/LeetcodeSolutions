class Solution {
    public static int majorityElement(int[] nums) {

		Arrays.sort(nums);
		int val = -1;
		int flag = 0;
		int frequency;
		int temp;
		boolean findit = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				temp = i;

				frequency = temp - val;
				val = temp;
				if (frequency > nums.length / 2) {
					flag = i;

					findit = true;
				}

			}
		}
		if (!findit) {
			flag = nums.length - 1;

		}

		return nums[flag];
	}

}
