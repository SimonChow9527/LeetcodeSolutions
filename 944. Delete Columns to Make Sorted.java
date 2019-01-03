class Solution {
   public int minDeletionSize(String[] A) {

		int ans = 0;
		for (int j = 0; j < A[0].length(); j++)
			for (int i = 0; i < A.length - 1; i++)
				if ((int) A[i].charAt(j) - (int) A[i + 1].charAt(j) > 0) {
					ans++;
					break;
				}

		return ans;
	}
}
