class Solution {
   	public static boolean isHappy(int n) {
		int sum;		
			do {
				sum = 0;
				String temp = Integer.toString(n);
				for (int i = 0; i < temp.length(); i++) {
					int temp2 = (temp.charAt(i) - 48);
					sum += temp2 * temp2;
				}
				n = sum;
			} while (Integer.toString(sum).length()>1);
			
		 
		if(sum==1||sum==7)
		return true;
		else
			return false;
	}

}
