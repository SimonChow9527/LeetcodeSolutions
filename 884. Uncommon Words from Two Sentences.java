class Solution {
 	static public String[] uncommonFromSentences(String A, String B) {

		String[] Asplit = A.split(" ");
		String[] Bsplit = B.split(" ");

		Arrays.sort(Asplit);
		Arrays.sort(Bsplit);

		List<String> TempAlist = Arrays.asList(Asplit);
		ArrayList<String> Alist = new ArrayList<>();
		Alist.addAll(TempAlist);

		List<String> TempBlist = Arrays.asList(Bsplit);
		ArrayList<String> Blist = new ArrayList<>();
		Blist.addAll(TempBlist);

		HashSet<String> ADuplicate = new HashSet<>();
		HashSet<String> BDuplicate = new HashSet<>();

		for (int i = 0; i < Asplit.length - 1; i++) {
			if (Asplit[i].equals(Asplit[i + 1]))
				ADuplicate.add(Asplit[i]);
		}

		for (int i = 0; i < Bsplit.length - 1; i++) {
			if (Bsplit[i].equals(Bsplit[i + 1]))
				BDuplicate.add(Bsplit[i]);
		}

		Alist.removeAll(ADuplicate);
		Alist.removeAll(BDuplicate);
		Blist.removeAll(BDuplicate);
		Blist.removeAll(ADuplicate);

		Iterator<String> AIt = Alist.iterator();
		ArrayList<String> temp = new ArrayList<>();

		while (AIt.hasNext()) {
			String tempString = AIt.next();
			if (Blist.contains(tempString))
				temp.add(tempString);
		}

		Alist.removeAll(temp);
		Blist.removeAll(temp);

		ArrayList<String> result = new ArrayList<>();
		result.addAll(Alist);
		result.addAll(Blist);

		String[] ans = new String[result.size()];
		ans = result.toArray(ans);

		return ans;

	}
}
