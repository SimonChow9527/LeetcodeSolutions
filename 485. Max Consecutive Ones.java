class Solution {
  public int findMaxConsecutiveOnes(int[] nums) {
	        
		 String[] temp=Arrays.toString(nums).replaceAll(",", "").replaceAll("\\s","").replaceAll("\\[","").replaceAll("\\]","").split("0");
		int max=0;
		 for (String i : temp) {
		      if (i.length() > max) max = i.length();
		
	    }
			 return max;
	 }
   
	
}
