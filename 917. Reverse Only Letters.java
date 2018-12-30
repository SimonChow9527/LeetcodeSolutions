class Solution {
    public String reverseOnlyLetters(String S) {

		Stack<Character> temp = new Stack<>();
		Boolean[] index = new Boolean[S.length()];
		char[] chararray = S.toCharArray();
		for (int i = 0; i < S.length(); i++) {
			index[i] = Character.isLetter(S.charAt(i));
			if (index[i])
				temp.push(S.charAt(i));
		}
		for (int j = 0; j < S.length(); j++) {
			if (index[j])
				chararray[j] = temp.pop();
		}

		return new String(chararray);

	}
}
