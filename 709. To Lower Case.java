class Solution {
   public  String toLowerCase(String str) {
			char temp[] =new char[str.length()];
			for (int i = 0; i < str.length(); i++) {
				if ((int)str.charAt(i) >= 65 && (int)str.charAt(i) <= 90) {
					temp[i] = (char) ((int) str.charAt(i) + 32);
				} else
					{temp[i] = str.charAt(i);
					}
			}
			return String.valueOf(temp);
		}
}
