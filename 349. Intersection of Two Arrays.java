class Solution {
  public static int[] intersection(int[] nums1, int[] nums2) {

		Set<Integer> temp = new HashSet<Integer>();
		Set<Integer> temp2 = new HashSet<Integer>();
		List<Integer> temp3 = new ArrayList<Integer>();
		for (int a : (nums1)) {

			temp.add(a);

		}
		for (int b : (nums2)) {

			temp2.add(b);

		}
		for (int b : (temp2)) {

			if (!temp.add(b)) {

				temp3.add(b);
			}
		}

		Integer[] ans1 = temp3.toArray(new Integer[temp3.size()]);
		int[] ans = new int[ans1.length];
		for (int i = 0; i < ans1.length; i++) {
			ans[i] = ans1[i].intValue();
		}
		int[] ans2 = {};
		return (nums1.length >= nums2.length ? nums2 : nums1).length == 0 ? ans2 : ans;
	}


}
