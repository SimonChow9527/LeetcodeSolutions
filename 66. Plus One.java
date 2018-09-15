 class solution {

	public int[] plusOne(int[] digits) {

		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < digits.length; i++)
			ans.add(digits[i]);
		for (int j = ans.size() - 1; j > 0; j--) {
			int temp = ans.get(j) + 1;
			if (temp < 10) {
				ans.set(j, ans.get(j) + 1);
				break;
			} else {
				ans.set(j, 0);
				ans.set(j - 1, ans.get(j - 1) + 1);
				if (ans.get(j - 1) < 10)
					break;
			}
		}
		if ((ans.size() == 1) && (ans.get(0) < 10))
			ans.set(0, ans.get(0) + 1);
		if (ans.get(0) >= 10) {
			ans.set(0, 0);
			ans.add(0, 1);
		}
		int[] ans2 = new int[ans.size()];
		for (int i = 0; i < ans2.length; i++) {
			ans2[i] = ans.get(i).intValue();
		}
		return ans2;
	}
