class Solution {

		public static boolean isAnagram(String s, String t) {

		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		boolean ans = true;

		for (int i = 97; i <= 122; i++) {
			map1.put((char) i,  0);
			map2.put((char) i,  0);
		}
		for (char s1 : s.toCharArray()) {
			map1.put(s1, map1.get(s1) + 1);
		}
		for (char t1 : t.toCharArray()) {
			map2.put(t1, map2.get(t1) + 1);
		}

		for (int j = 97; j <= 122; j++) {
			if ( map1.get((char) j).intValue()!= map2.get((char) j).intValue())
			{
				ans = false;
				System.out.println(j+" "+(char)j+" "+map1.get((char) j)+" "+map2.get((char) j));
			}
				
		}
		return ans;

	}
}
