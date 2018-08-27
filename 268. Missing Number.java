class Solution {
     public int missingNumber(int[] nums) {
	        
		 int sum=0;
		 for(int i=0;i<nums.length;i++)
			 sum+=nums[i];
		 return (1+nums.length)*nums.length/2-sum;
	    }
}
