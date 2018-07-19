class Solution {

	public static String translate(String s) {
		StringBuffer temp = new StringBuffer();
		final String[] Morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
				"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		for (int i = 0; i < s.length(); i++) {

			switch (s.charAt(i)) {
			case 'a':
				temp.append(Morse[0]);
				break;
			case 'b':
				temp.append(Morse[1]);
				break;
			case 'c':
				temp.append(Morse[2]);
				break;
			case 'd':
				temp.append(Morse[3]);
				break;
			case 'e':
				temp.append(Morse[4]);
				break;
			case 'f':
				temp.append(Morse[5]);
				break;
			case 'g':
				temp.append(Morse[6]);
				break;
			case 'h':
				temp.append(Morse[7]);
				break;
			case 'i':
				temp.append(Morse[8]);
				break;
			case 'j':
				temp.append(Morse[9]);
				break;
			case 'k':
				temp.append(Morse[10]);
				break;
			case 'l':
				temp.append(Morse[11]);
				break;
			case 'm':
				temp.append(Morse[12]);
				break;
			case 'n':
				temp.append(Morse[13]);
				break;
			case 'o':
				temp.append(Morse[14]);
				break;
			case 'p':
				temp.append(Morse[15]);
				break;
			case 'q':
				temp.append(Morse[16]);
				break;
			case 'r':
				temp.append(Morse[17]);
				break;
			case 's':
				temp.append(Morse[18]);
				break;
			case 't':
				temp.append(Morse[19]);
				break;
			case 'u':
				temp.append(Morse[20]);
				break;
			case 'v':
				temp.append(Morse[21]);
				break;
			case 'w':
				temp.append(Morse[22]);
				break;
			case 'x':
				temp.append(Morse[23]);
				break;
			case 'y':
				temp.append(Morse[24]);
				break;
			case 'z':
				temp.append(Morse[25]);
				break;

			}
		}
		String aa = temp.toString();
		return aa;
	}

	public static int uniqueMorseRepresentations(String[] words) {

		ArrayList<String> transword = new ArrayList<String>();
		
		for (int i = 0; i < words.length; i++) {
			transword.add(translate(words[i]));
		}
		Set<String> set= new HashSet<String>(transword);
		int num=set.size();
		
	
	
		return num;
	}}
