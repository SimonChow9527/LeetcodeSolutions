class Solution {
public int[] twoSum(int[] numbers, int target) {

		int index = 0;
		int index2 = 0;
		for (int i = 0; i < numbers.length; i++)
			for (int j = 1; j < numbers.length - i; j++) {
				if ((numbers[i] + numbers[i + j]) == target)
                {index = i;
				    index2 = i + j;
                break;}
			}

		int[] ans = { index+1, index2+1 };
		return ans;
	}
}
