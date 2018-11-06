public class Solution {

		public static int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];

		HashMap<Integer, List<Integer>> temp = new HashMap<>();
		for (int i = 0; i < nums.length; i++)
			if (!temp.containsKey(nums[i])) {
				ArrayList<Integer> temp2 = new ArrayList<>();
				temp2.add(i);
				temp.put(nums[i], temp2);
			} else
				temp.get(nums[i]).add(i);
		for (int value : temp.keySet())
			if (temp.containsKey(target - value)) {
				if (temp.get(value).size() == 1) {
					ans[1] = temp.get(value).get(0);
					ans[0] = temp.get(target - value).get(0);
				}
				if (temp.get(value).size() == 2) {
					ans[1] = temp.get(value).get(1);
					ans[0] = temp.get(value).get(0);
				}
			}

		return ans;
	}
