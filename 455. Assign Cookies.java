class Solution {
 	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int j = 0;
		int i = 0;
		if (g.length == 0 || s.length == 0) {
			return 0;
		} else {
			do {
				if (s[j] >= g[i])
					i++;
				j++;
			} while (j < s.length && i < g.length);
			return i;
		}
	}
}
