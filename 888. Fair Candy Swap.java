class Solution {
	public int[] fairCandySwap(int[] A, int[] B) {

		int sumA = 0;
		int sumB = 0;
		int average;
		int[] ans= {};
		for (int a : A)
			sumA += a;
		for (int b : B)
			sumB += b;
		average = (sumA + sumB) / 2;

		for (int i = 0; i < A.length; i++)
			for (int j = 0; j < B.length; j++) {
				if ((sumA - A[i] + B[j]) == average)
					ans = new int[] { A[i], B[j] };
			}

		return ans;

	}
}
