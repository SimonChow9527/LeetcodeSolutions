
  public class Solution {

	public static int peakIndexInMountainArray(int[] A) {
		int b = 0;
		for (int i = 1; i < A.length - 1; i++) {
			if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
				System.out.println(i);
				b = i;
			}
			if ((i + 1) == A.length - 1 && A[i + 1] > A[i]) {
				System.out.println(i + 1);
				b = i + 1;
			}
			if ((i - 1) == 0 && A[i - 1] > A[i]) {
				System.out.println(i - 1);
				b = i - 1;
			}
			
		}
		return b;
	}

