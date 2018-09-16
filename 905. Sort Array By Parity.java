class Solution {
	public int[] sortArrayByParity(int[] A) {
		int temp;
		int index = 0;
		boolean flag = false;
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 1) {
				for (int j = A.length - 1; j > i; j--) {
					if (A[j] % 2 == 0) {
						index = j;
						flag = true;
						break;
					}

				}
				if (flag) {
					temp = A[i];
					A[i] = A[index];
					A[index] = temp;
				}

			}
		}

		return A;
	}

}
