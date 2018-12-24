class Solution {
    	public int repeatedNTimes(int[] A) {

		int result = 0;
		Arrays.sort(A);
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] == A[i + 1])
				result = A[i];
		}
		return result;
	}

}
