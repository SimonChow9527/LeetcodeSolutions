class Solution {
public boolean lemonadeChange(int[] bills) {

		int $5 = 0;
		int $10 = 0;
		int $20 = 0;
		for (int i = 0; i < bills.length; i++) {
			if (bills[i] == 5)
				$5++;
			if (bills[i] == 10) {
				if ($5 - 1 < 0)
					return false;
				else {
					$10++;
					$5--;
				}
			}
			if (bills[i] == 20) {
				if ((($10 - 1 < 0) &&($5 - 3 < 0)) ||($5 - 1 < 0))
					return false;
				else {
					if ($10 - 1 < 0) {
						$20++;
						$5 -= 3;
					} else {
						$20++;
						$5--;
						$10--;
					}
				}
			}
		}
		return true;
	}
}
