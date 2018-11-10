class Solution {
    public int[] sortArrayByParityII(int[] A) {

		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0)
				even.add(A[i]);
			else
				odd.add(A[i]);
		}
		for (int j = 0; j < A.length / 2; j++) {
			result.add(even.get(j));
			result.add(odd.get(j));
		}

		int[] ans = new int[A.length];
		for (int o = 0; o < A.length; o++) {
			ans[o] = result.get(o);
		}

		return ans;

	}

}
