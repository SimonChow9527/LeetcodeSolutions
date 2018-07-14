class Solution {
  public static int calPoints(String[] ops) {
		List<Integer> validscore = new ArrayList<Integer>();
		int ans = 0;
		for (int i = 0; i < ops.length; i++) {

			if (Character.isDigit(ops[i].charAt(0))) {

				validscore.add(Integer.parseInt(ops[i]));
				ans += Integer.parseInt(ops[i]);
				

			} else if (ops[i].charAt(0)=='-') {
				
				validscore.add(Integer.parseInt(ops[i]));
				ans += Integer.parseInt(ops[i]);
				

			} else if (ops[i].charAt(0) == 'C') {

				ans -= validscore.get(validscore.size() - 1);
				validscore.remove(validscore.size() - 1);

			} else if (ops[i].charAt(0) == 'D') {

				ans += 2 * validscore.get(validscore.size() - 1);

				validscore.add(2 * validscore.get(validscore.size() - 1));

			} else if (ops[i].charAt(0) == '+') {

				
				ans += (validscore.get(validscore.size() - 1) +validscore.get(validscore.size() - 2));
				validscore.add(validscore.get(validscore.size() - 1) + validscore.get(validscore.size() - 2));

			}

		}
		return ans;
	}

}
