class Solution {
  public int binaryGap(int N) {

		String temp = Integer.toBinaryString(N);
		int ans =0;
		for (int i = 0; i < temp.length()-1; i++) {
			if (temp.charAt(i) == '1') {
				int b=findnext(i, temp);
				if((b-i)>=ans)
				{
					ans=(b-i);
				}
			}
		}
return ans;
	}

	public static int findnext(int i, String s) {
		int ans = 0;
		do {
			if (s.charAt(i + 1) == '1') {
				ans = i + 1;
				
				break;
			} else {
				
				i++;
			}

		} while ((i + 1) < s.length());
		return ans;
	}
}
