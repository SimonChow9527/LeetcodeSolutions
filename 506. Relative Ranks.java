public class solution {
	public static String[] findRelativeRanks(int[] nums) {

		Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
		List<String> ans = new ArrayList<String>();
		int[] nums2 = new int[nums.length];
		for (int o = 0; o < nums.length; o++) {
			nums2[o] = nums[o];
		}
		Arrays.sort(nums2);
		for (int i = 0; i < nums2.length; i++) {
			temp.put(nums2[i], nums2.length - i);
		}
		for (int j = 0; j < nums.length; j++) {
			if (temp.get(nums[j]) == 1)
				ans.add("Gold Medal");
			else if (temp.get(nums[j]) == 2)
				ans.add("Silver Medal");
			else if (temp.get(nums[j]) == 3)
				ans.add("Bronze Medal");
			else
				ans.add(Integer.toString(temp.get(nums[j])));
		}

		return ans.toArray(new String[ans.size()]);

	}
