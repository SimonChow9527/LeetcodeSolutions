class Solution {

	public static boolean rotateString(String A, String B) {

		char[] temp = A.toCharArray();
		char temp2;
		boolean ans = false;
		if (A.length() != 0 && B.length() != 0) {
			for (int i = 1; i < A.length(); i++) {
				temp2 = temp[temp.length - 1];
				System.arraycopy(temp, 0, temp, 1, temp.length - 1);
				temp[0] = temp2;
				String result = new String(temp);

				if (result.charAt(0) == B.charAt(0)) {

					if (result.equals(B)) {
						ans = true;

					}

				}

			}

			return ans;

		}

		else {
			if (A.length() == 0 && B.length() == 0)
				return true;
			else
				return false;
		}

	}
}
