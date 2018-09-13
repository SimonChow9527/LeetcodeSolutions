class Solution {
public boolean isPowerOfFour(int num) {

		int quotient = 0;
		int remainder = 0;
		boolean ans = true;
		if (num >0) {
			do {
				quotient = num / 4;
				remainder = num % 4;
				num = quotient;
				if (remainder != 0) {

					if (!((quotient == 0)&&(remainder == 1))){
						ans = false;
						break;
					} else {
						break;
					}
				}
			} while (quotient != 1);

			return ans;
		} else {
			return false;
		}
	}
}
