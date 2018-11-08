class Solution {
public int numUniqueEmails(String[] emails) {

		HashSet<String> ansSet = new HashSet<>();
		for (String s : emails) {
			StringBuilder sb = new StringBuilder(s);
			boolean MetfirstAdd = false;
			outerloop: for (int j = 0; j < sb.length(); j++) {
				if (sb.charAt(j) != '@') {
					if (!MetfirstAdd) {
						if (sb.charAt(j) == '.')
							sb.setCharAt(j, ' ');
						else if (sb.charAt(j) == '+') {
							MetfirstAdd = true;
							sb.setCharAt(j, ' ');
						}
					} else {
						sb.setCharAt(j, ' ');
					}
				} else
					break outerloop;
			}
			ansSet.add(sb.toString().replaceAll(" ", ""));
		}
		return ansSet.size();
	}


}
