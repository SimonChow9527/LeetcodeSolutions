class Solution {
   		public int removeElement(int[] nums, int val) {

		int mark = nums.length - 1;
		int count = 0;
		if (nums.length > 1)
			for (int i = 0; i < mark; i++) {
				if (nums[i] == val) // do switch operation
				{
					if (i<mark&&nums[mark] != val) {
						int temp = nums[i];
						nums[i] = nums[mark];
						nums[mark] = temp;
						mark--;
					} else {
						do {
							mark--;
						} while (nums[mark] == val&&mark>i);
						int temp = nums[i];
						nums[i] = nums[mark];
						nums[mark] = temp;
						mark--;
					}
				}
			}
		else {
			if (nums.length == 1)
				if (nums[0] == val) {
					int[] temp = new int[0];
					nums = temp;
				}
		}
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] == val)
				count++;
		}
		return (nums.length-count);
	}

}
