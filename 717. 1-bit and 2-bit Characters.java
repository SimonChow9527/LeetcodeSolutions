class Solution {
	public boolean isOneBitCharacter(int[] bits) {

		int count = 0;
		boolean ans = false;
		do {
			if (bits[count] == 0) {
				count++;
				ans = true;
			} else if (bits[count] == 1) {
				count += 2;
				ans = false;
			}
		} while (count != (bits.length));

		return ans;

	}
}
