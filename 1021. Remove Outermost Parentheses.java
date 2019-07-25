class Solution {
	public String removeOuterParentheses(String S) {

		String temp = "";
		int sum = 0;
		int index = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '(')
				sum -= 1;
			else if (S.charAt(i) == ')')
				sum += 1;
			if (sum == 0) {				
				String tempString = S.substring(index+1, i);		
				temp += tempString;
				index = i+1;
			}
		}
		return temp;
	}
}
