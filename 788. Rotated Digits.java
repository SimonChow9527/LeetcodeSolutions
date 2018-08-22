class Solution {
    
	public static int rotatedDigits(int N) {
		boolean flag;
		boolean flag2;
		int ans = 0;
		for (int i = 1; i <= N; i++) {
			flag = true;
			flag2 = false;
			String temp = Integer.toString(i);
			char[] temp2 = temp.toCharArray();

			for (int j = 0; j < temp2.length; j++) {

				if (temp2[j] == '3' || temp2[j] == '4' || temp2[j] == '7') {
					flag = false;

				}

				if (temp2[j] == '2' || temp2[j] == '5' || temp2[j] == '6' || temp2[j] == '9') {
					flag2 = true;

				}
			}

			if (flag && flag2) {

				ans += 1;
			}
		}

		return ans;
	}




}
